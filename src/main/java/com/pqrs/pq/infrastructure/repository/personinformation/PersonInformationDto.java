package com.pqrs.pq.infrastructure.repository.personinformation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "PERSON_INFORMATION")
public class PersonInformationDto {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "phone_number")
  private String phoneNumber;
  @Column(name = "email_address")
  private String emailAddress;
  @Column(name = "identification_number")
  private String identificationNumber;
}
