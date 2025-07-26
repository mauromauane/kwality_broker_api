package mz.co.kwalityprojects.brokerapi.insurance.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SubmitInsurancePaymentDTO {
    public Long policyId;
    public BigDecimal amount;
    public String currency;
    public LocalDateTime paymentDate;
    public String status; // COMPLETED, PENDING, etc.
    public String transactionReference;
    public String paymentMethod;
}
