package com.pqrs.pq.infrastructure.repository.jobtitle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitleDto, Long> {

}
