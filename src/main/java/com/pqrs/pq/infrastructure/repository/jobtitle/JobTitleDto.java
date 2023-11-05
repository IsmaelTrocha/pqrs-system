package com.pqrs.pq.infrastructure.repository.jobtitle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JOB_TITTLE")
public class JobTitleDto {

  @Id

  private Long id;
  private String name;
  private String description;

}
