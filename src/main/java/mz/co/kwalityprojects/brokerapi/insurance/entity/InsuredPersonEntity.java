package mz.co.kwalityprojects.brokerapi.insurance.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Nélio Muchisse
 * July 2025
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public  class InsuredPersonEntity extends PanacheEntity {
    public String name;
    public String fullName;
    public String nationalId;
    public String gender;
    public LocalDate birthDate;
    public String phoneNumber;
    public String altPhoneNumber;
    public String email;
    public String address;

    @OneToMany(mappedBy = "insuredPerson")
    private List<PolicyEntity> apolices = new ArrayList<>();

    @CreationTimestamp
    public LocalDateTime createdAt;

    @UpdateTimestamp
    public LocalDateTime updatedAt;
}
