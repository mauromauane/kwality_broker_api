package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.ClaimStatus;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Claim extends CustomerPanacheBase {

    @OneToOne
    private Policy policy;
    private ClaimStatus status;
    private Date createdDate;
    private String description;
    private String sinisterPlace;
    private Date sinisterDate;
    private String sinisterType;
    @OneToOne
    private Users users;
    @Column(length = 35)
    private String claimant;
    private Date closureDate;
    private String claimProcessId;
    private String sinisterStatus;
    private BigDecimal franchiseAmount;


}
