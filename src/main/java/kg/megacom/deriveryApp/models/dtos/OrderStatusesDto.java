package kg.megacom.deriveryApp.models.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class OrderStatusesDto {

    private Long id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date start_date;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date end_date;
    private OrderDto orderDto;
    private StatusesDto statusesDto;
}
