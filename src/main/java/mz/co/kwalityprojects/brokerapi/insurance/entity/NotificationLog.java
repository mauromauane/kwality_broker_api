package mz.co.kwalityprojects.brokerapi.insurance.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationLog extends PanacheEntity {


    private String errorDesc;
    private String body;
    @CreationTimestamp
    public LocalDateTime lastUpdated;
    @CreationTimestamp
    public LocalDateTime notificationDate;
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
