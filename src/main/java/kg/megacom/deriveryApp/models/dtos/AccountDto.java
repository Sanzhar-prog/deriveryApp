package kg.megacom.deriveryApp.models.dtos;

import kg.megacom.deriveryApp.models.entities.Users;
import lombok.Data;
import javax.validation.constraints.*;

@Data
public class AccountDto {

    private Long id;
    @Size(min = 5, max = 12)
    private String login;
    @Size(min = 5, max = 10)
    private String password;
    private UsersDto usersDto;
}
