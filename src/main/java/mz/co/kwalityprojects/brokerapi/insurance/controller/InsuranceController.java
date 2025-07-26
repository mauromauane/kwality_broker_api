package mz.co.kwalityprojects.brokerapi.insurance.controller;

import com.google.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import mz.co.kwalityprojects.brokerapi.insurance.dto.InsuredPersonDTO;
import mz.co.kwalityprojects.brokerapi.insurance.dto.SubmitInsurancePaymentDTO;
import mz.co.kwalityprojects.brokerapi.insurance.service.InsuranceService;
import mz.co.kwalityprojects.brokerapi.insurance.utils.Constant;
/**
 * @author Nélio Muchisse
 * July 2025
 */

@Path(Constant.API_V1)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InsuranceController {

    @Inject
    InsuranceService insuranceService;

    @GET
    @Path("/list/policyNumber/{policyNumber}")
    public Response getInsuredPersonByPolicyNumber(@QueryParam("policyNumber") String policyNumber){
        InsuredPersonDTO insuredPerson = insuranceService.findInsuredPersonByPolicyNumber(policyNumber);

        if(insuredPerson == null){
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("user with id "+policyNumber+ "not found")
                    .build();
        }
        return Response.ok(insuredPerson).build();
    }

    @POST()
    @Path("/payments/submit")
    public Response submitPayment(@Valid SubmitInsurancePaymentDTO submitInsurancePaymentDTO) {

        return Response.status(Response.Status.CREATED).entity(submitInsurancePaymentDTO).build();
    }
}
