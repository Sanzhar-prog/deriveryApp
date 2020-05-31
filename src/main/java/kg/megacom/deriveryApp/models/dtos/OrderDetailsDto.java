package kg.megacom.deriveryApp.models.dtos;

import lombok.Data;

@Data
public class OrderDetailsDto {

    private Long id;
    private OrderDto orderDto;
    private DishDto dishDto;
    private double amount;
}
