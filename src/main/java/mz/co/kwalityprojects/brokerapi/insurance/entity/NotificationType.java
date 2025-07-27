package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotificationType extends CustomerPanacheBase {

    private String defaultMessage;
    private String description;
    private Boolean enabled;
    private String subject;


}
