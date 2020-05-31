package kg.megacom.deriveryApp.models.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RestaurantDto {

    private Long id;
    @NotBlank
    private String name;
    private String address;
    private String phone;
    private boolean isActive;
}
