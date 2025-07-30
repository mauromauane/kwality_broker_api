package mz.co.kwalityprojects.brokerapi.insurance.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import mz.co.kwalityprojects.brokerapi.insurance.dto.PaymentRequestDTO;
import mz.co.kwalityprojects.brokerapi.insurance.dto.PaymentScheduleDTO;
import mz.co.kwalityprojects.brokerapi.insurance.dto.ResponseDTO;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PaymentStatus;
import mz.co.kwalityprojects.brokerapi.insurance.mapper.PaymentScheduleMapper;
import mz.co.kwalityprojects.brokerapi.insurance.repository.PaymentScheduleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@ApplicationScoped
public class PaymentScheduleServiceImp  implements IPaymentScheduleService{
    private static final Logger logger = LoggerFactory.getLogger(PaymentScheduleServiceImp.class);

    @Inject
    PaymentScheduleRepository  paymentScheduleRepository;

    @Override
    public List<PaymentScheduleDTO> findPaymentScheduleByPolicyNumberAndStatus(String policyNumber, PaymentStatus paymentStatus) {

        logger.info("Attempt to fetch paymentSchedule policyNumber :{} and paymentStatus :{}",policyNumber, paymentStatus);

        return  paymentScheduleRepository.findPaymentScheduleByPolicyNumberAndStatus(policyNumber, paymentStatus)
                .stream().map(PaymentScheduleMapper::toDTO)
                .toList();

    }

    @Override
    public ResponseDTO submitPayment(PaymentRequestDTO paymentRequestDTO) {
        logger.info("Submit payment request: {}", paymentRequestDTO);

        return null;
    }
}
