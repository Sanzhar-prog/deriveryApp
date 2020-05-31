package kg.megacom.deriveryApp.models.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class PricesDto {

    private Long id;
    private double price;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date start_date;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date end_date;
    private DishDto dishDto;
}
