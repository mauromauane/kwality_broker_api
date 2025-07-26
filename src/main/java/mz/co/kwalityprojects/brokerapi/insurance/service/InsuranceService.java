package mz.co.kwalityprojects.brokerapi.insurance.service;

import mz.co.kwalityprojects.brokerapi.insurance.dto.InsuredPersonDTO;
/**
 * @author Nélio Muchisse
 * July 2025
 */


public interface InsuranceService {
    InsuredPersonDTO findInsuredPersonByPolicyNumber(String policyNumber);

    InsuredPersonDTO findPolicyByPolicyNumber(String policyNumber);

}
