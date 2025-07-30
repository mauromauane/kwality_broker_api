package mz.co.kwalityprojects.brokerapi.insurance.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InsuredPersonDTO implements Serializable {
    private String fullName;
    private String nationalId;
    private String gender;
    private LocalDate birthDate;
    private String phoneNumber;
    private String altPhoneNumber;
    private String email;
    private String address;
}
