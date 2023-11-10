package com.pqrs.pq.domain.services.address;

import com.pqrs.pq.domain.entities.Address;
import java.util.List;

public interface GetAllAddressByCustomerIdService {

  List<Address> getAddressByCustomerId(Long id);

}
