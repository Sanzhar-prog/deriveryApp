package kg.megacom.deriveryApp.models.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CustomerDto {

    private Long id;
    @Size(min = 3)
    @NotBlank
    private String name;
    @NotBlank
    private String phone;
    @NotBlank
    private String address;
    @NotBlank
    private String houseNo;
    @NotBlank
    private String flatNo;
}
