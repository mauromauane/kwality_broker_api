package mz.co.kwalityprojects.brokerapi.insurance.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.UserStatus;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users extends PanacheEntity {


    @Column(length = 25)
    private String userId;
    private String roleId;
    private String status = UserStatus.ACTIVE.toString();
    @CreationTimestamp
    private LocalDateTime createdDate;
    private String userKey;
  
}
