package mz.co.kwalityprojects.brokerapi.insurance.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.UserStatus;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users extends CustomerPanacheBase {
    @Column(length = 25)
    private String userId;
    private String roleId;
    @Builder.Default
    private String status = UserStatus.ACTIVE.toString();
    private String userKey;
  
}
