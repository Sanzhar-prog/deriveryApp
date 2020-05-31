package kg.megacom.deriveryApp.models.mappers;

import kg.megacom.deriveryApp.models.dtos.CustomerDto;
import kg.megacom.deriveryApp.models.entities.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer customerDtoToCustomer(CustomerDto customerDto);
    @InheritInverseConfiguration
    CustomerDto customerToCustomerDto(Customer customer);

    List<Customer> customerDtosToCustomers(List<CustomerDto> customerDtos);
    @InheritInverseConfiguration
    List<CustomerDto> customerToCustomerDtos(List<Customer> customers);
}
