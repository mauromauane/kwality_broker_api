package mz.co.kwalityprojects.brokerapi.insurance.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import mz.co.kwalityprojects.brokerapi.insurance.entity.PaymentSchedule;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PaymentStatus;

import java.util.List;

@ApplicationScoped
public class PaymentScheduleRepository implements PanacheRepository<PaymentSchedule> {

    public List<PaymentSchedule> findPaymentScheduleByPolicyNumberAndStatus(String policyNumber, PaymentStatus paymentStatus) {
        return find("SELECT ps FROM PaymentSchedule ps WHERE ps.policy.policyNumber = ?1 AND ps.paymentStatus = ?2",
                policyNumber, paymentStatus)
                .list();
    }
}
