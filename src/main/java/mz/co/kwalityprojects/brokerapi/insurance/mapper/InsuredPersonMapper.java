package mz.co.kwalityprojects.brokerapi.insurance.mapper;


import mz.co.kwalityprojects.brokerapi.insurance.dto.InsuredPersonDTO;
import mz.co.kwalityprojects.brokerapi.insurance.entity.InsuredPerson;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface InsuredPersonMapper {

    InsuredPersonDTO toDTO(InsuredPerson entity);

    InsuredPerson toEntity(InsuredPersonDTO dto);
}
