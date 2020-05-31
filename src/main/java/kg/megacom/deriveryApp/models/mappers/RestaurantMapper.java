package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.RestaurantDto;
import kg.megacom.deriveryApp.models.entities.Restaurant;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant restaurantDtoToRestaurant(RestaurantDto restaurantDto);
    @InheritInverseConfiguration
    RestaurantDto restaurantToRestaurantDto(Restaurant restaurant);

    List<Restaurant> restautantDtosToRestaurants(List<RestaurantDto> restaurantDtos);
    @InheritInverseConfiguration
    List<RestaurantDto> restaurantsToRestaurantDtos(List<Restaurant> restaurants);
}
