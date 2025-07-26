package mz.co.kwalityprojects.brokerapi.insurance.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Coverage extends PanacheEntity {


    private BigDecimal coverAmount;
    private BigDecimal premiumAmount;
    private Double coverageRate;

}
