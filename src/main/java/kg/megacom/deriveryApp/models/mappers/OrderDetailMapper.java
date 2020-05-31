package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.OrderDetailsDto;
import kg.megacom.deriveryApp.models.entities.OrderDetails;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);

    @Mapping(source = "orderDto", target = "order")
    @Mapping(source = "dishDto", target = "dish")
    OrderDetails orderDetailDtoToOrderDetail(OrderDetailsDto orderDetailsDto);
    @InheritInverseConfiguration
    OrderDetailsDto orderDetailToOrderDetailDto(OrderDetails orderDetails);

    @Mapping(source = "orderDto", target = "order")
    @Mapping(source = "dishDto", target = "dish")
    List<OrderDetails> orderDetailsDtosToOrderDetails(List<OrderDetailsDto> orderDetailsDtos);
    @InheritInverseConfiguration
    List<OrderDetailsDto> orderDetailsToOrderDetailsDtos(List<OrderDetails> orderDetails);
}
