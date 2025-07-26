package mz.co.kwalityprojects.brokerapi.insurance.mapper;


import mz.co.kwalityprojects.brokerapi.insurance.dto.InsuredPersonDTO;
import mz.co.kwalityprojects.brokerapi.insurance.entity.InsuredPersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi")
public interface InsuredPersonMapper {

    InsuredPersonMapper INSTANCE = Mappers.getMapper(InsuredPersonMapper.class);

    InsuredPersonDTO toDTO(InsuredPersonEntity entity);

    InsuredPersonEntity toEntity(InsuredPersonDTO dto);
}
