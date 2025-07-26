package mz.co.kwalityprojects.brokerapi.insurance.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends PanacheEntity {

    private String name; //name of the product
    private String description; //description
    @CreationTimestamp
    private LocalDateTime createdDate; //date of the creation
    private String createdBy; //user who created
    private Boolean productStatus; //status (can be enabled or disabled)
    @Column(length = 25)
    private String productType; //may be standalone or embedded


}
