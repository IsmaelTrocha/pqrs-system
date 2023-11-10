package com.pqrs.pq.application.address;

import com.pqrs.pq.domain.entities.Address;
import com.pqrs.pq.domain.services.address.GetAllAddressService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetAllAddressApplication {

  private final GetAllAddressService getAllAddressService;

  public List<Address> findAllAddresses() {
    return getAllAddressService.getAllAddress();
  }

}
