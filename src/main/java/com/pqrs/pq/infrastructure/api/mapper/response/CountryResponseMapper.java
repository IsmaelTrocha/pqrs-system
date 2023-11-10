package com.pqrs.pq.infrastructure.api.mapper.response;

import com.pqrs.pq.domain.entities.Country;
import com.pqrs.pq.infrastructure.api.dto.response.CountryResponse;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CountryResponseMapper extends EntityToDto<Country, CountryResponse> {

}
