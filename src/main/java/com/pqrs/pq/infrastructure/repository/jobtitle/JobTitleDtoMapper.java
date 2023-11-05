package com.pqrs.pq.infrastructure.repository.jobtitle;

import com.pqrs.pq.domain.entities.JobTitle;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface JobTitleDtoMapper extends EntityToDto<JobTitle, JobTitleDto> {

}
