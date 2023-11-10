package com.pqrs.pq.infrastructure.adapter.country;

import com.pqrs.pq.domain.entities.Country;
import com.pqrs.pq.domain.services.country.GetCountryService;
import com.pqrs.pq.infrastructure.repository.country.CountryDtoMapper;
import com.pqrs.pq.infrastructure.repository.country.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GetCountryByIdAdapter implements GetCountryService {

  private final CountryRepository countryRepository;
  private final CountryDtoMapper countryDtoMapper;

  @Override
  public Country getCountryById(Long countryId) {
    return countryDtoMapper.toEntity(countryRepository.findById(countryId)
        .orElseThrow(
            () -> new RuntimeException("Country with id " + countryId + " was not found.")));
  }

  @Autowired
  public GetCountryByIdAdapter(CountryRepository countryRepository,
      CountryDtoMapper countryDtoMapper) {
    this.countryRepository = countryRepository;
    this.countryDtoMapper = countryDtoMapper;
  }
}
