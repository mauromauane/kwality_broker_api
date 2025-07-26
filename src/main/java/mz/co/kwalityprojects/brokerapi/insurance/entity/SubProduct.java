package mz.co.kwalityprojects.brokerapi.insurance.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubProduct extends PanacheEntity {

    private String name; //name of the sub-product (Actual plan name)
    private String description; //product description
    @CreationTimestamp
    private LocalDateTime createdDate; // date of creation
    private String userId;
    @OneToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;
    private String aliasName;


}
