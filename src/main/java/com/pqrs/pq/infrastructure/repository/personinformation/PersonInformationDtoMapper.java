package com.pqrs.pq.infrastructure.repository.personinformation;

import com.pqrs.pq.domain.entities.PersonInformation;
import com.pqrs.pq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface PersonInformationDtoMapper extends
    EntityToDto<PersonInformation, PersonInformationDto> {

}
