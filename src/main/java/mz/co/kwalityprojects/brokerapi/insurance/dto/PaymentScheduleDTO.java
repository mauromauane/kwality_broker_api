package mz.co.kwalityprojects.brokerapi.insurance.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentScheduleDTO implements Serializable {
    private BigDecimal repaymentAmount;
    private BigDecimal paidAmount;
    private LocalDate createdDate;
    private LocalDate lastAttempt;
    private String paymentStatus; // convert from enum to String for serialization
    private String policyNumber;
    private String transactionId;
    private String repaymentMonth;
    private String repaymentYear;
    private Boolean normalPayment ;
    private String errorMessage;
}
