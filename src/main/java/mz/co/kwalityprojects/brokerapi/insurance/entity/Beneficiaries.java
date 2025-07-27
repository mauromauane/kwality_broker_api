package mz.co.kwalityprojects.brokerapi.insurance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.base.CustomerPanacheBase;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.BeneficiaryStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Beneficiaries extends CustomerPanacheBase {

    @Column(length = 50)
    private String name;
    private Date dateOfBirth;
    @OneToOne
    private RelationShip relationShip;
    private Date createdDate;
    private Date lastUpdated;
    @Column(length = 20)
    private String userId;
    private BigDecimal totalCharge;
    @OneToOne
    private Policy policy;
    private BeneficiaryStatus beneficiaryStatus;

}
