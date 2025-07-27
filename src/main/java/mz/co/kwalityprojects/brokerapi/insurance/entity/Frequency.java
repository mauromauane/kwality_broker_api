package mz.co.kwalityprojects.brokerapi.insurance.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Frequency  extends CustomerPanacheBase {

    private String frequencyId;
    @Column(length = 15)
    private String name;
    private Integer nrOfMonths;


}
