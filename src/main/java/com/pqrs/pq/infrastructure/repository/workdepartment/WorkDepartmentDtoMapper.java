package com.pqrs.pq.infrastructure.repository.workdepartment;

import com.pqrs.pq.domain.entities.WorkDepartment;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface WorkDepartmentDtoMapper extends EntityToDto<WorkDepartment, WorkDepartmentDto> {

}
