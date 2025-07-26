package mz.co.kwalityprojects.brokerapi.insurance.dto;

import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PolicyStatus;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PolicyDTO {

    public String policyNumber;

    public LocalDate startDate;

    public LocalDate endDate;

    public BigDecimal amount;

    public PolicyStatus policyStatus;
}
