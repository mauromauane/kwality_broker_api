package mz.co.kwalityprojects.brokerapi.insurance.service;

import com.google.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import mz.co.kwalityprojects.brokerapi.insurance.dto.InsuredPersonDTO;
import mz.co.kwalityprojects.brokerapi.insurance.entity.InsuredPersonEntity;
import mz.co.kwalityprojects.brokerapi.insurance.mapper.InsuredPersonMapper;
import mz.co.kwalityprojects.brokerapi.insurance.repository.InsuredRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Nélio Muchisse
 * July 2025
 */


@ApplicationScoped
public class InsuranceServiceImp implements InsuranceService {

    private static final Logger logger = LoggerFactory.getLogger(InsuranceServiceImp.class);
    @Inject
    InsuredRepository insuredRepository;

    @Inject
    InsuredPersonMapper mapper;

    @Override
    public InsuredPersonDTO findInsuredPersonByPolicyNumber(String policyNumber) {
        InsuredPersonEntity InsuredPersonEntity = insuredRepository.findInsuredByPolicyNumber(policyNumber);
        return mapper.toDTO(InsuredPersonEntity);
    }
}
