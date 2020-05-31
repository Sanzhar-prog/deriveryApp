package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.PositionsDto;
import kg.megacom.deriveryApp.models.entities.Positions;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PositionMapper {

    PositionMapper INSTANCE = Mappers.getMapper(PositionMapper.class);

    Positions positionDtoToPosition(PositionsDto positionsDto);
    @InheritInverseConfiguration
    PositionsDto positionToPositionDto(Positions positions);

    List<Positions> positionDtosToPositions(List<PositionsDto> positionsDtos);
    @InheritInverseConfiguration
    List<PositionsDto> positionsToPositionDtos(List<Positions> positions);


}
