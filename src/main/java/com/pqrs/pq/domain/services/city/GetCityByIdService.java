package com.pqrs.pq.domain.services.city;

import com.pqrs.pq.domain.entities.City;

public interface GetCityByIdService {

  City findCityById(Long id);

}
