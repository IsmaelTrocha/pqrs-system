package com.pqrs.pq.infrastructure.repository.identificationtype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentificationTypeRepository extends JpaRepository<IdentificationTypeDto, Long> {

}
