package com.pqrs.pq.domain.services.country;

import com.pqrs.pq.domain.entities.Country;

public interface GetCountryService {

  Country getCountryById(Long countryId);

}
