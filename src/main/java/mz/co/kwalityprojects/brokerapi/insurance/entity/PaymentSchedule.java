package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.*;
import lombok.*;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PaymentStatus;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PolicyStatus;

import java.math.BigDecimal;
import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PaymentSchedule extends CustomerPanacheBase {
    private BigDecimal repaymentAmount;
    private BigDecimal paidAmount;
    private Date createdDate;
    private Date lastAttempt;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @OneToOne
    private Policy policy;
    @Column(length = 50)
    private String transactionId;
    private String repaymentMonth;
    private String repaymentYear;
    @Builder.Default
    private Boolean normalPayment = true;
    private String errorMessage;


}
