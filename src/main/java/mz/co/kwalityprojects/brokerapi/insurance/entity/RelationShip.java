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
public class RelationShip extends CustomerPanacheBase {

    @Column(length = 20)
    private String description;

}
