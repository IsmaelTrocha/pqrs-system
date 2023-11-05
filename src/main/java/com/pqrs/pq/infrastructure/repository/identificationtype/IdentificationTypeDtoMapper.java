package com.pqrs.pq.infrastructure.repository.identificationtype;

import com.pqrs.pq.domain.entities.IdentificationType;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface IdentificationTypeDtoMapper extends
    EntityToDto<IdentificationType, IdentificationTypeDto> {

}
