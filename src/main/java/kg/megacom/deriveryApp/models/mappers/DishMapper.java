package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.DishDto;
import kg.megacom.deriveryApp.models.entities.Dish;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DishMapper {

    DishMapper INSTANCE = Mappers.getMapper(DishMapper.class);
    @Mapping(source = "menuDto", target = "menu")
    Dish dishDtoToDish(DishDto dishDto);
    @InheritInverseConfiguration
    DishDto dishToDishDto(Dish dish);

    @Mapping(source = "menuDto", target = "menu")
    List<Dish> dishDtosToDishes(List<DishDto> dishDtos);
    @InheritInverseConfiguration
    List<DishDto> dishesToDishDtos(List<Dish> dishes);
}
