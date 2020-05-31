package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.AccountDto;
import kg.megacom.deriveryApp.models.entities.Accounts;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "usersDto", target = "users")
    Accounts accountDtoToAccounts(AccountDto accountDto);
    @InheritInverseConfiguration
    AccountDto accountsToAccountDtos(Accounts accounts);
}
