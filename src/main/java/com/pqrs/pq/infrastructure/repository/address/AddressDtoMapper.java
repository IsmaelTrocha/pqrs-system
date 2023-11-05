package com.pqrs.pq.infrastructure.repository.address;

import com.pqrs.pq.domain.entities.Address;
import com.pqrs.pq.infrastructure.repository.city.CityDtoMapper;
import com.pqrs.pq.infrastructure.repository.customer.CustomerDtoMapper;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CityDtoMapper.class,
    CustomerDtoMapper.class,
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AddressDtoMapper extends EntityToDto<Address, AddressDto> {

}
