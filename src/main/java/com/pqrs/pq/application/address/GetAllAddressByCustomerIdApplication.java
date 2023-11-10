package com.pqrs.pq.application.address;

import com.pqrs.pq.domain.entities.Address;
import com.pqrs.pq.domain.services.address.GetAllAddressByCustomerIdService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class GetAllAddressByCustomerIdApplication {

  private final GetAllAddressByCustomerIdService getAllAddressByCustomerIdService;

  public List<Address> getAllAddressByCustomerId(Long id) {
    return getAllAddressByCustomerIdService.getAddressByCustomerId(id);
  }
}
