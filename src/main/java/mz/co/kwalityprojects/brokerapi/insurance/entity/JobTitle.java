package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobTitle extends CustomerPanacheBase {
    @Column(length = 40)
    private String name;

    private String description;


}
