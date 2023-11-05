package com.pqrs.pq.domain.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkDepartment {

  private Long id;
  private String name;
  private String description;
  private String managerName;
  private String managerEmail;
  private String departmentPhone;
  private LocalDateTime insertionDate;

}
