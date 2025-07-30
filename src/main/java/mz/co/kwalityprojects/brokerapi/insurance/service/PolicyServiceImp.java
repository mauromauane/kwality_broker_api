package mz.co.kwalityprojects.brokerapi.insurance.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import mz.co.kwalityprojects.brokerapi.insurance.dto.PolicyDTO;
import mz.co.kwalityprojects.brokerapi.insurance.mapper.PolicyMapper;
import mz.co.kwalityprojects.brokerapi.insurance.repository.PolicyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * @author Nélio Muchisse
 * July 2025
 */


@ApplicationScoped
public class PolicyServiceImp implements IPolicyService {

    private static final Logger logger = LoggerFactory.getLogger(PolicyServiceImp.class);
    @Inject
    PolicyRepository policyRepository;

    @Override
    public Optional<PolicyDTO> findPoliceByPolicyNumberAndPhoneNumber(String policyNumber, String phoneNumber) {
        return  policyRepository.findPoliceByPolicyNumberAndPhoneNumber(policyNumber, phoneNumber)
                     .map(PolicyMapper::toDTO);

    }


}
