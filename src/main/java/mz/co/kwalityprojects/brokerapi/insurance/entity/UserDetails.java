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
public class UserDetails extends PanacheEntity {
    @CreationTimestamp
    public LocalDateTime createdDate;
    @CreationTimestamp
    public LocalDateTime lastUpdate;
    @Column(length = 50)
    private String email;
    @Column(length = 50)
    private String emailAlt;
    @Column(length = 35)
    private String fullName;
    @Column(length = 25)
    private String mobile;
    @Column(length = 25)
    private String mobileAlt;
    @Column(length = 35)
    private String surname;
    @OneToOne
    private Users users;


}
