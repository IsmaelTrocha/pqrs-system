package com.pqrs.pq.infrastructure.repository.country;

import com.pqrs.pq.domain.entities.Country;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CountryDtoMapper extends EntityToDto<Country, CountryDto> {

}
