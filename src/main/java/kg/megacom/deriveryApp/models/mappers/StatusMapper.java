package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.StatusesDto;
import kg.megacom.deriveryApp.models.entities.Statuses;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StatusMapper {

    StatusMapper INSTANCE = Mappers.getMapper(StatusMapper.class);

    Statuses statusDtoToStatus(StatusesDto statusesDto);
    @InheritInverseConfiguration
    StatusesDto statusToStatusDto(Statuses statuses);

    List<Statuses> statusDtosToStatuses(List<StatusesDto> statusesDtos);
    @InheritInverseConfiguration
    List<StatusesDto> statusesToStatusDtos(List<Statuses> statuses);
}
