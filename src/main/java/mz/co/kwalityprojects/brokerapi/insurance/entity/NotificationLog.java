package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationLog extends CustomerPanacheBase {

    private String errorDesc;
    private String body;
    private String notificationStatus;
    private String mobileNumber;
    private int retries;
    private String notificationId;
    @OneToOne
    private NotificationType notificationType;
    private String transactionId;
    @Column(length = 50)
    private String emailAddress;
    private String notificationChannel;


}
