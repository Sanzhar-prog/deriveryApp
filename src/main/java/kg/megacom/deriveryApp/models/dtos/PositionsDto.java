package kg.megacom.deriveryApp.models.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PositionsDto {

    private Long id;
    @NotBlank
    private String name;
    private boolean isActive;
}
