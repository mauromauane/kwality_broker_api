package mz.co.kwalityprojects.brokerapi.insurance.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mz.co.kwalityprojects.brokerapi.insurance.entity.enums.PaymentMethodStatus;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentRequestDTO implements Serializable {
    @NotBlank(message = "Policy number is required")
    private String policyNumber;

    @NotNull(message = "Payment method is required")
    private PaymentMethodStatus paymentMethod;
}
