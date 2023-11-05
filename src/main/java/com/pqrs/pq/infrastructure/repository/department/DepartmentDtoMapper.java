package com.pqrs.pq.infrastructure.repository.department;

import com.pqrs.pq.domain.entities.Department;
import com.pqrs.pq.infrastructure.repository.country.CountryDtoMapper;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CountryDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface DepartmentDtoMapper extends EntityToDto<Department, DepartmentDto> {

}
