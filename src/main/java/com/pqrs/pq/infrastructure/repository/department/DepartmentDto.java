package com.pqrs.pq.infrastructure.repository.department;

import com.pqrs.pq.infrastructure.repository.country.CountryDto;
import jakarta.persistence.Entity;
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
@Table(name = "DEPARTMENT")
public class DepartmentDto {

  private Long id;
  private String name;
  private CountryDto country;
}
