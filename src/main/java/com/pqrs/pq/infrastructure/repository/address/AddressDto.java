package com.pqrs.pq.infrastructure.repository.address;

import com.pqrs.pq.infrastructure.repository.city.CityDto;
import com.pqrs.pq.infrastructure.repository.customer.CustomerDto;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "street_address")
  private String streetAddress;
  @Column(name = "postal_code")
  private String postalCode;
  @Column(name = "avenue_address")
  private String avenueAddress;
  @ManyToOne
  @JoinColumn(name = "city_id")
  private CityDto city;
  @ManyToOne
  @JoinColumn(name = "customer_id")
  private CustomerDto customer;

}
