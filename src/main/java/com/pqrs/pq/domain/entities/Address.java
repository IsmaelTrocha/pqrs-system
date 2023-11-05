package com.pqrs.pq.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

  private Long id;
  private String streetAddress;
  private String postalCode;
  private String avenueAddress;
  private City city;
  private Customer customer;

}
