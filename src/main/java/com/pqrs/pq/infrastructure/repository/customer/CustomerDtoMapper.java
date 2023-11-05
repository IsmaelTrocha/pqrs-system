package com.pqrs.pq.infrastructure.repository.customer;

import com.pqrs.pq.domain.entities.Customer;
import com.pqrs.pq.infrastructure.repository.identificationtype.IdentificationTypeDtoMapper;
import com.pqrs.pq.infrastructure.repository.personinformation.PersonInformationDtoMapper;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    PersonInformationDtoMapper.class,
    IdentificationTypeDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CustomerDtoMapper extends EntityToDto<Customer, CustomerDto> {

}
