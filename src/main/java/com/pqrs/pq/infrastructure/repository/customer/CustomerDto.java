package com.pqrs.pq.infrastructure.repository.customer;

import com.pqrs.pq.infrastructure.repository.identificationtype.IdentificationTypeDto;
import com.pqrs.pq.infrastructure.repository.personinformation.PersonInformationDto;
import com.pqrs.pq.infrastructure.repository.status.StatusDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Entity
@Table(name = "CUSTOMER")
public class CustomerDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "person_information_id")
  private PersonInformationDto personInformation;
  @ManyToOne
  @JoinColumn(name = "identification_type_id")
  private IdentificationTypeDto identificationType;
  @Column(name = "identification_number")
  private String identificationNumber;
  @ManyToOne
  @JoinColumn(name = "status_id")
  private StatusDto status;
  private String role;
  @Column(name = "created_by")
  private String createdBy;
  @Column(name = "creation_date")
  private LocalDateTime creationDate;
  @Column(name = "update_date")
  private LocalDateTime updateDate;
  @Column(name = "updated_by")
  private String updatedBy;

}
