package com.pqrs.pq.application.country;

import com.pqrs.pq.domain.entities.Country;
import com.pqrs.pq.domain.services.country.CreateCountryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCountryApplication {

  private final CreateCountryService createCountryService;

  public Country createCountry(Country country) {
    return createCountryService.createCountry(country);
  }

}
