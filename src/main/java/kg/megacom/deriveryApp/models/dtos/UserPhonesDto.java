package kg.megacom.deriveryApp.models.dtos;

import lombok.Data;

@Data
public class UserPhonesDto {

    private Long id;
    private String phone;
    private boolean isActive;
    private UsersDto usersDto;
}
