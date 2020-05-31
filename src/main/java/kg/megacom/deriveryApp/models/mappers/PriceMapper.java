package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.PricesDto;
import kg.megacom.deriveryApp.models.entities.Prices;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {

    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    @Mapping(source = "priceDto", target = "price")
    Prices priceDtoToPrice(PricesDto pricesDto);
    @InheritInverseConfiguration
    PricesDto priceToPriceDto(Prices prices);

    List<Prices> priceDtosToPrices(List<PricesDto> pricesDtos);
    @InheritInverseConfiguration
    List<PricesDto> pricesToPriceDtos(List<Prices> prices);
}
