package mz.co.kwalityprojects.brokerapi.insurance.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import mz.co.kwalityprojects.brokerapi.insurance.entity.PolicyEntity;

/**
 * @author Nélio Muchisse
 * July 2025
 */

@ApplicationScoped
public class PolicyRepository implements PanacheRepository<PolicyEntity> {

    public PolicyEntity findPoliceByPolicyNumber(String policyNumber) {
        return find("SELECT p FROM PolicyEntity p WHERE p.policyNumber = ?1", policyNumber)
                .firstResult();
    }

}
