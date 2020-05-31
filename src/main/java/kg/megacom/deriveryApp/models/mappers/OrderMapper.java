package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.OrderDto;
import kg.megacom.deriveryApp.models.entities.Order;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "customerDto", target = "customer")
    Order orderDtoToOrder(OrderDto orderDto);
    @InheritInverseConfiguration
    OrderDto orderToOrderDto(Order order);

    List<Order> orderDtosToOrders(List<OrderDto> orderDtos);
    @InheritInverseConfiguration
    List<OrderDto> ordersToOrderDtos(List<Order> orders);
}
