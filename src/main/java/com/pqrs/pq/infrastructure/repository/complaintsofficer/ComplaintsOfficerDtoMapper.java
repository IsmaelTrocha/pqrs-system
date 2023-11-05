package com.pqrs.pq.infrastructure.repository.complaintsofficer;

import com.pqrs.pq.domain.entities.ComplaintsOfficer;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ComplaintsOfficerDtoMapper extends
    EntityToDto<ComplaintsOfficer, ComplaintsOfficerDto> {

}
