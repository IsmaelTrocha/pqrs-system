package com.pqrs.pq.domain.services.address;

import com.pqrs.pq.domain.entities.Address;

public interface GetAddressByIdService {

  Address getAddressById(Long id);

}
