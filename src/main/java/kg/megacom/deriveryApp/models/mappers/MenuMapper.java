package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.MenuDto;
import kg.megacom.deriveryApp.models.entities.Menu;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MenuMapper {

    MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

    Menu menuDtoToMenu(MenuDto menuDto);
    @InheritInverseConfiguration
    MenuDto menuToMenuDto(Menu menu);
}
