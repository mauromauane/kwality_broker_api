package mz.co.kwalityprojects.brokerapi.insurance.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class InsuredPersonDTO {
    private String name;
    private String fullName;
    private String nationalId;
    private String gender;
    private LocalDate birthDate;
    private String phoneNumber;
    private String email;
    private String address;
    private BigDecimal amount;
}
