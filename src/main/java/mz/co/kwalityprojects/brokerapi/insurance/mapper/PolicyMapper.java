package mz.co.kwalityprojects.brokerapi.insurance.mapper;


import mz.co.kwalityprojects.brokerapi.insurance.dto.InsuredPersonDTO;
import mz.co.kwalityprojects.brokerapi.insurance.dto.PolicyDTO;
import mz.co.kwalityprojects.brokerapi.insurance.entity.InsuredPerson;
import mz.co.kwalityprojects.brokerapi.insurance.entity.Policy;

public class PolicyMapper {

    public static PolicyDTO toDTO(Policy policy) {

        InsuredPerson insuredPerson = policy.getInsuredPerson();

        InsuredPersonDTO insuredPersonDTO = InsuredPersonDTO.builder()
                .address(insuredPerson.getAddress())
                .email(insuredPerson.getEmail())
                .altPhoneNumber(insuredPerson.getAltPhoneNumber())
                .phoneNumber(insuredPerson.getPhoneNumber())
                .fullName(insuredPerson.getFullName())
                .birthDate(insuredPerson.getBirthDate())
                .gender(insuredPerson.getGender())
                .nationalId(insuredPerson.getNationalId()).build();

        return PolicyDTO.builder()
                .currency(policy.getCurrency())
                .amount(policy.getAmount())
                .policyNumber(policy.getPolicyNumber())
                .policyStatus(policy.getPolicyStatus())
                .startDate(policy.getStartDate())
                .endDate(policy.getEndDate())
                .insuredPerson(insuredPersonDTO).build();
    }

}
