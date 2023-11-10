package com.pqrs.pq.infrastructure.adapter.country;

import com.pqrs.pq.domain.entities.Country;
import com.pqrs.pq.domain.services.country.CreateCountryService;
import com.pqrs.pq.infrastructure.repository.country.CountryDtoMapper;
import com.pqrs.pq.infrastructure.repository.country.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateCountryAdapter implements CreateCountryService {

  private final CountryRepository countryRepository;
  private final CountryDtoMapper countryDtoMapper;


  @Override
  public Country createCountry(Country country) {
    return countryDtoMapper
        .toEntity(countryRepository
            .save(countryDtoMapper
                .toDto(country)));
  }
}
