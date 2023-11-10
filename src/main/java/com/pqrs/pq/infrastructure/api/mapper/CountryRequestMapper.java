package com.pqrs.pq.infrastructure.api.mapper;

import com.pqrs.pq.domain.entities.Country;
import com.pqrs.pq.infrastructure.api.dto.request.CountryRequest;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CountryRequestMapper extends EntityToDto<Country, CountryRequest> {

}
