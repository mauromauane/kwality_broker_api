package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PaymentMethodStatus;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PaymentStatus;

import java.time.LocalDateTime;

/**
 * @author Nélio Muchisse
 * July 2025
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InsurancePayment extends CustomerPanacheBase {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "policy_number", nullable = false)
    private Policy policy;

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private LocalDateTime paymentDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentMethodStatus methodStatus;

    private String transactionReference;

}
