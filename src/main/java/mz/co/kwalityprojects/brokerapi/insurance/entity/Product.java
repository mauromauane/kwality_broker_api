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
public class Product extends CustomerPanacheBase {

    private String name; //name of the product
    private String description; //description
    private String createdBy; //user who created
    private Boolean productStatus; //status (can be enabled or disabled)
    @Column(length = 25)
    private String productType; //may be standalone or embedded


}
