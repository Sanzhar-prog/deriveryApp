package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.UserPhonesDto;
import kg.megacom.deriveryApp.models.dtos.UsersDto;
import kg.megacom.deriveryApp.models.entities.UserPhones;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserPhoneMapper {

    UserPhoneMapper INSTANCE = Mappers.getMapper(UserPhoneMapper.class);

    @Mapping(source = "usersDto", target = "users")
    UserPhones userPhoneDtoToUserPhone(UserPhonesDto userPhonesDto);
    @InheritInverseConfiguration
    UserPhonesDto userPhoneToUserPhoneDto(UserPhones userPhones);

    List<UserPhones> userPhoneDtosToUserPhones(List<UserPhonesDto> userPhonesDtos);
    @InheritInverseConfiguration
    List<UserPhonesDto> userPhonesToUserPhoneDtos(List<UserPhones> userPhones);
}
