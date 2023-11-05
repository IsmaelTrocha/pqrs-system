package com.pqrs.pq.infrastructure.repository.city;

import com.pqrs.pq.domain.entities.City;
import com.pqrs.pq.infrastructure.repository.department.DepartmentDtoMapper;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    DepartmentDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CityDtoMapper extends EntityToDto<City, CityDto> {

}
