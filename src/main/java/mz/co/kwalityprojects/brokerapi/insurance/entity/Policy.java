package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PolicyStatus;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Policy extends CustomerPanacheBase {

    @Column(unique = true, nullable = false, name = "policy_number")
    public String policyNumber;

    public LocalDate startDate;

    public LocalDate endDate;

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
    @OneToOne
    private Coverage coverage;

}
