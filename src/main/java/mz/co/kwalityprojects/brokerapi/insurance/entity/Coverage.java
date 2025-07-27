package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Coverage extends CustomerPanacheBase {

    private BigDecimal coverAmount;
    private BigDecimal premiumAmount;
    private Double coverageRate;

}
