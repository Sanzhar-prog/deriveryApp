package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.OrderStatusesDto;
import kg.megacom.deriveryApp.models.entities.OrderStatuses;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderStatusesMapper {

    OrderStatusesMapper INSTANCE = Mappers.getMapper(OrderStatusesMapper.class);

    @Mapping(source = "orderDto", target = "order")
    @Mapping(source = "statusesSto", target = "statuses")
    OrderStatuses orderStatusDtoToOrderStautus(OrderStatusesDto orderStatusesDto);
    @InheritInverseConfiguration
    OrderStatusesDto orderStatusToOrderStatusDto(OrderStatuses orderStatuses);

    List<OrderStatuses> orderStatusDtosToOrderStatuses(List<OrderStatusesDto> orderStatusesDtos);
    @InheritInverseConfiguration
    List<OrderStatusesDto> orderStatusesToOrderStatusesDtos(List<OrderStatuses> orderStatuses);

}
