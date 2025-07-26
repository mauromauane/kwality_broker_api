package mz.co.kwalityprojects.brokerapi.insurance.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import mz.co.kwalityprojects.brokerapi.insurance.entity.InsuredPersonEntity;

/**
 * @author Nélio Muchisse
 * July 2025
 */

@ApplicationScoped
public class InsuredRepository implements PanacheRepository<InsuredPersonEntity> {

    public InsuredPersonEntity findInsuredByPolicyNumber(String policyNumber) {
        return find("SELECT p.insuredPerson FROM PolicyEntity p WHERE p.policyNumber = ?1", policyNumber)
                .firstResult();
    }

}
