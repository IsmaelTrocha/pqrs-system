package com.pqrs.pq.infrastructure.repository.workdepartment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WORK_DEPARTMENT")
@Entity
public class WorkDepartmentDto {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  @Column(name = "department_phone")
  private String departmentPhone;
  @Column(name = "insertion_date")
  private LocalDateTime insertionDate;
  @Column(name = "created_by")
  private String createdBy;
  @Column(name = "update_date")
  private LocalDateTime updateDate;
  @Column(name = "updated_by")
  private String updatedBy;
}
