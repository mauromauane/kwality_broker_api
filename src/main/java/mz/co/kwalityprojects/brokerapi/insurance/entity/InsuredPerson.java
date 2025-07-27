package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;

import java.time.LocalDate;
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
public  class InsuredPerson extends CustomerPanacheBase {
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
    private List<Policy> apolices = new ArrayList<>();
}
