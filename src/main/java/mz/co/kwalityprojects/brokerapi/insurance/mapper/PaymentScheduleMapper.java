package mz.co.kwalityprojects.brokerapi.insurance.mapper;

import mz.co.kwalityprojects.brokerapi.insurance.dto.PaymentScheduleDTO;
import mz.co.kwalityprojects.brokerapi.insurance.entity.PaymentSchedule;

import java.time.ZoneId;

public class PaymentScheduleMapper {

    public static PaymentScheduleDTO toDTO(PaymentSchedule paymentSchedule) {

        PaymentScheduleDTO.PaymentScheduleDTOBuilder paymentScheduleDTOBuilder =
                PaymentScheduleDTO.builder();

        if (paymentSchedule.getLastAttempt() != null) {
            paymentScheduleDTOBuilder.lastAttempt(paymentSchedule.getLastAttempt().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate());

        }

        paymentScheduleDTOBuilder
                .normalPayment(paymentSchedule.isPersistent())
                .createdDate(paymentSchedule.getCreatedDate().toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate())
                .paymentStatus(paymentSchedule.getPaymentStatus().name())
                .repaymentAmount(paymentSchedule.getRepaymentAmount())
                .repaymentMonth(paymentSchedule.getRepaymentMonth())
                .repaymentYear(paymentSchedule.getRepaymentYear())
                .policyNumber(paymentSchedule.getPolicy().getPolicyNumber())
                .errorMessage(paymentSchedule.getErrorMessage())
                .paidAmount(paymentSchedule.getPaidAmount())
                .transactionId(paymentSchedule.getTransactionId())
                .repaymentAmount(paymentSchedule.getRepaymentAmount());

        return paymentScheduleDTOBuilder.build();

    }
}
