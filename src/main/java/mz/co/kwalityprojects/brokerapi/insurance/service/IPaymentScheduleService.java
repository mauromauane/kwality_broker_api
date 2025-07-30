package mz.co.kwalityprojects.brokerapi.insurance.service;

import mz.co.kwalityprojects.brokerapi.insurance.dto.PaymentRequestDTO;
import mz.co.kwalityprojects.brokerapi.insurance.dto.PaymentScheduleDTO;
import mz.co.kwalityprojects.brokerapi.insurance.dto.ResponseDTO;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PaymentStatus;

import java.util.List;

public interface IPaymentScheduleService {
     List<PaymentScheduleDTO> findPaymentScheduleByPolicyNumberAndStatus(String policyNumber, PaymentStatus status);

    ResponseDTO submitPayment(PaymentRequestDTO paymentRequestDTO);


}
