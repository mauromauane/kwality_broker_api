package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PaymentSchedule extends CustomerPanacheBase {

    private BigDecimal repaymentAmount;
    private BigDecimal paidAmount;
    private Date createdDate;
    private Date lastAttempt;
    private String paymentStatus;
    @OneToOne
    private Policy policy;
    @Column(length = 50)
    private String transactionId;
    private String repaymentMonth;
    private String repaymentYear;
    private Boolean normalPayment = true;
    private String errorMessage;


}
