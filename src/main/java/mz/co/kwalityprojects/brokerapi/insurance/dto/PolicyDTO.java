package mz.co.kwalityprojects.brokerapi.insurance.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PolicyStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyDTO implements Serializable {
    private String policyNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal amount;
    private PolicyStatus policyStatus;
    private String currency;
    private InsuredPersonDTO insuredPerson;


}
