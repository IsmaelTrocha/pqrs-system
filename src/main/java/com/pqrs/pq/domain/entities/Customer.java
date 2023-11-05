package com.pqrs.pq.domain.entities;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  private Long id;
  private PersonInformation personInformation;
  private IdentificationType identificationType;
  private String identificationNumber;
  private Status status;
  private String role;
  private String createdBy;
  private LocalDateTime creationDate;
  private LocalDateTime updatedDate;

}
