package mz.co.kwalityprojects.brokerapi.insurance.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO implements Serializable {
    public String message;
    public int status;
}
