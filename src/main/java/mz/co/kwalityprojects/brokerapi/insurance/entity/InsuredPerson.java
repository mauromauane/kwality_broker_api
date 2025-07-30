package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Nélio Muchisse
 * July 2025
 */

@EqualsAndHashCode(callSuper = false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public  class InsuredPerson extends CustomerPanacheBase {
    private String fullName;
    private String nationalId;
    private String gender;
    private LocalDate birthDate;
    private String phoneNumber;
    private String altPhoneNumber;
    private String email;
    private String address;

    @Builder.Default
    @OneToMany(mappedBy = "insuredPerson")
    private List<Policy> apolices = new ArrayList<>();
}
