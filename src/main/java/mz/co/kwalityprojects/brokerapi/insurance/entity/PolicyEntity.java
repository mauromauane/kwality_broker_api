package mz.co.kwalityprojects.brokerapi.insurance.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PolicyStatus;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PolicyEntity extends PanacheEntity {

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
    public InsuredPersonEntity insuredPerson;

    @OneToOne
    private SubProduct subProduct;
    private String currency;
    @OneToOne
    private Users createdBy;
    @CreationTimestamp
    private LocalDateTime createdDate;
    @CreationTimestamp
    private LocalDateTime lastUpdated;
    @OneToOne
    private Frequency paymentFrequency;
    @OneToOne
    private Coverage coverage;

}
