package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubProduct extends CustomerPanacheBase {

    private String name; //name of the sub-product (Actual plan name)
    private String description; //product description
    private String userId;
    @OneToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;
    private String aliasName;


}
