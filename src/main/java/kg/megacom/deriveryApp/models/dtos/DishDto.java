package kg.megacom.deriveryApp.models.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class DishDto {

    private Long id;
    @NotBlank
    private String name;
    private float size;
    private boolean isActive;
    private String photo;
    private MenuDto menuDto;
}
