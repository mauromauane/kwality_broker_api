package mz.co.kwalityprojects.brokerapi.insurance.controller;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import mz.co.kwalityprojects.brokerapi.insurance.dto.ResponseDTO;
import mz.co.kwalityprojects.brokerapi.insurance.dto.PaymentRequestDTO;
import mz.co.kwalityprojects.brokerapi.insurance.dto.PaymentScheduleDTO;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PaymentStatus;
import mz.co.kwalityprojects.brokerapi.insurance.service.IPaymentScheduleService;
import mz.co.kwalityprojects.brokerapi.insurance.service.IPolicyService;
import mz.co.kwalityprojects.brokerapi.insurance.utils.Constant;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.List;

/**
 * @author Nélio Muchisse
 * July 2025
 */
@Tag(name = "Insurance", description = "Insurance policy operations")
@Path(Constant.API_V1)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InsuranceController {

    @Inject
    IPolicyService IPolicyService;

    @Inject
    IPaymentScheduleService iPaymentScheduleService ;

    @GET
    @Path("/policies/details")
    @Operation(summary = "Get policy by policyNumber and phoneNumber", description = "Fetch a policy by its number")
    public Response getPoliceByPolicyNumberAndPhoneNumber(@QueryParam("policyNumber") String policyNumber,
                                                   @QueryParam("phoneNumber") String phoneNumber) {
        if (policyNumber == null || phoneNumber == null) {
            return buildErrorResponse("Both policyNumber and phoneNumber query parameters are required",
                    Response.Status.BAD_REQUEST);
        }
        return IPolicyService.findPoliceByPolicyNumberAndPhoneNumber(policyNumber, phoneNumber)
                .map(dto -> Response.ok(dto).build())
                .orElseGet(() -> buildErrorResponse("Policy not found", Response.Status.NOT_FOUND));
    }

    @GET
    @Path("/payments/paymentSchedule")
    @Operation(summary = "Get PaymentSchedule by policyNumber and paymentStatus", description = "Fetch a PaymentSchedule by policyNumber and paymentStatus")

    public Response getPaymentScheduleByPolicyNumberAndStatus(@QueryParam("policyNumber") String policyNumber,
                                                          @QueryParam("paymentStatus") PaymentStatus paymentStatus) {
        if (policyNumber == null || paymentStatus == null) {
            return buildErrorResponse("Both policyNumber and paymentStatus query parameters are required",
                    Response.Status.BAD_REQUEST);
        }
        List<PaymentScheduleDTO> paymentScheduleList = iPaymentScheduleService
                .findPaymentScheduleByPolicyNumberAndStatus(policyNumber, paymentStatus);

        if (paymentScheduleList.isEmpty()) {
            return Response.status(Response.Status.NO_CONTENT).build(); // 204 No Content
        }
        return Response.ok(paymentScheduleList).build();
    }

    @POST
    @Path("/payments/submit")
    @Operation(summary = "Submit paymentSchedule by policyNumber and paymentStatus", description = "Submit paymentSchedule by policyNumber and paymentStatus")

    public Response submitPayment(@Valid PaymentRequestDTO paymentRequestDTO) {

        iPaymentScheduleService.submitPayment(paymentRequestDTO);

        return Response.ok("SUCCESS").build();
    }

    private Response buildErrorResponse(String message, Response.Status status) {
        ResponseDTO responseDTO = ResponseDTO.builder()
                .message(message)
                .status(status.getStatusCode())
                .build();
        return Response.status(status).entity(responseDTO).build();
    }
}
