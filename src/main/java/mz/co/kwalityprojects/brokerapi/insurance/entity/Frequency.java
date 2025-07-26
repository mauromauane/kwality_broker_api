package mz.co.kwalityprojects.brokerapi.insurance.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Frequency  extends PanacheEntity {

    private String frequencyId;
    @Column(length = 15)
    private String name;
    private Integer nrOfMonths;


}
