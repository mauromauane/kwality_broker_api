package mz.co.kwalityprojects.brokerapi.insurance.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import mz.co.kwalityprojects.brokerapi.insurance.entity.InsuredPerson;

/**
 * @author Nélio Muchisse
 * July 2025
 */

@ApplicationScoped
public class InsuredRepository implements PanacheRepository<InsuredPerson> {

    public InsuredPerson findInsuredByPolicyNumber(String policyNumber) {
        return find("SELECT p FROM Policy p JOIN FETCH p.insuredPerson WHERE p.policyNumber = ?1", policyNumber)
                .firstResult();
    }

}
