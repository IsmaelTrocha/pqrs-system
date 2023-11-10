package com.pqrs.pq.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonInformation {

  private Long id;
  private String name;
  private String lastName;
  private String phoneNumber;
  private String emailAddress;
  private String identificationNumber;

}
