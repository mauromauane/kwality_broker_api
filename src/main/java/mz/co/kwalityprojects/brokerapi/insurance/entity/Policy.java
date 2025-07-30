package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.*;
import lombok.*;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PolicyStatus;

import java.math.BigDecimal;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Policy extends CustomerPanacheBase {

    @Column(unique = true, nullable = false, name = "policy_number")
    private String policyNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    @Column(nullable = false)
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    public PolicyStatus policyStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insured_person_id")
    public InsuredPerson insuredPerson;
    @OneToOne
    private SubProduct subProduct;
    private String currency;
    @OneToOne
    private Users createdBy;
    @OneToOne
    private Frequency paymentFrequency;

    @ManyToOne(fetch = FetchType.LAZY)
    private Coverage coverage;

}
