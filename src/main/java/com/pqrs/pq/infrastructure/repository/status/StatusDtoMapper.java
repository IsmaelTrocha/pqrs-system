package com.pqrs.pq.infrastructure.repository.status;

import com.pqrs.pq.domain.entities.Status;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface StatusDtoMapper extends EntityToDto<Status, StatusDto> {

}
