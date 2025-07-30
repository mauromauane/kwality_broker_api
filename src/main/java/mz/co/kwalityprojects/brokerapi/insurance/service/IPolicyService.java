package mz.co.kwalityprojects.brokerapi.insurance.service;

import mz.co.kwalityprojects.brokerapi.insurance.dto.PolicyDTO;

import java.util.Optional;

/**
 * @author Nélio Muchisse
 * July 2025
 */


public interface IPolicyService {
    Optional<PolicyDTO> findPoliceByPolicyNumberAndPhoneNumber(String policyNumber, String phoneNumber);
}
