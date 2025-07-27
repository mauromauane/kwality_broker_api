package mz.co.kwalityprojects.brokerapi.insurance.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import mz.co.kwalityprojects.brokerapi.insurance.dto.InsuredPersonDTO;
import mz.co.kwalityprojects.brokerapi.insurance.entity.InsuredPerson;
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

   // @Inject
  //  InsuredPersonMapper mapper;

    @Override
    public InsuredPersonDTO findInsuredPersonByPolicyNumber(String policyNumber) {
        InsuredPerson InsuredPerson = insuredRepository.findInsuredByPolicyNumber(policyNumber);
        return null; //mapper.toDTO(InsuredPerson);
    }

    @Override
    public InsuredPersonDTO findPolicyByPolicyNumber(String policyNumber) {
        return null;
    }
}
