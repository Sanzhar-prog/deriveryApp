package kg.megacom.deriveryApp.models.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UsersDto {

    private Long id;
    @NotBlank
    private String name;
    private PositionsDto positionsDto;
    private boolean isActive;
}
