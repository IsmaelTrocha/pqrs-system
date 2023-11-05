package com.pqrs.pq.infrastructure.repository.workdepartment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkDepartmentRepository extends JpaRepository<WorkDepartmentDto, Long> {

}
