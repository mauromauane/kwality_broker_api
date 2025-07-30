package mz.co.kwalityprojects.brokerapi.insurance.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import mz.co.kwalityprojects.brokerapi.insurance.entity.Policy;

import java.util.Optional;

/**
 * @author Nélio Muchisse
 * July 2025
 */

@ApplicationScoped
public class PolicyRepository implements PanacheRepository<Policy> {

    public Optional<Policy> findPoliceByPolicyNumberAndPhoneNumber(String policyNumber, String phoneNumber) {
        return find(" SELECT p FROM Policy p JOIN FETCH p.insuredPerson ip " +
                " WHERE p.policyNumber = ?1  AND ip.phoneNumber = ?2 ", policyNumber,phoneNumber)
                .firstResultOptional();
    }

}
