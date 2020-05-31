package kg.megacom.deriveryApp.models.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class OrderDto {

    private Long id;
    private CustomerDto customerDto;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date createDate;
    private double cost;
}
