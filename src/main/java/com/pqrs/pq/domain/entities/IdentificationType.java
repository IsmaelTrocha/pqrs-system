package com.pqrs.pq.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class IdentificationType {

  private Long id;
  private String name;
  private String identificationNumber;

}
