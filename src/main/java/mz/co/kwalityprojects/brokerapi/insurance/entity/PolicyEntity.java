package mz.co.kwalityprojects.brokerapi.insurance.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PolicyEntity extends PanacheEntity {

    @Column(unique = true, nullable = false)
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

}
