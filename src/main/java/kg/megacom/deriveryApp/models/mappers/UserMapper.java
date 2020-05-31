package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.UsersDto;
import kg.megacom.deriveryApp.models.entities.Users;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "positionsDto", target = "positions")
    Users userDtoToUser(UsersDto usersDto);
    @InheritInverseConfiguration
    UsersDto userToUserDto(Users users);

    List<Users> userDtosToUsers(List<UsersDto> usersDtos);
    @InheritInverseConfiguration
    List<UsersDto> usersToUserDtos(List<Users> users);
}
