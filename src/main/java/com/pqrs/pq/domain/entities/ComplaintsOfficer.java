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
public class ComplaintsOfficer {

  private Long id;
  private PersonInformation personInformation;
  private IdentificationType identificationType;
  private String identificationNumber;
  private Status status;
  private WorkDepartment workDepartment;
  private JobTitle jobTitle;
  private String role;
  private String createdBy;
  private LocalDateTime creationDate;
  private LocalDateTime updatedDate;
}
