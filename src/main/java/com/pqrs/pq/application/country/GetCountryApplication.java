package com.pqrs.pq.application.country;

import com.pqrs.pq.domain.entities.Country;
import com.pqrs.pq.domain.services.country.GetCountryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCountryApplication {

  private final GetCountryService getCountryService;

  public Country getCountry(Long id) {
    return getCountryService.getCountryById(id);
  }

}
