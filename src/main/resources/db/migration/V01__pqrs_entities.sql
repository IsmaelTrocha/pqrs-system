CREATE TABLE COUNTRY(
  id bigserial primary key,
  name varchar(255) not null
);

CREATE TABLE PERSON_INFORMATION (
  id bigserial primary key,
  name varchar(255) not null,
  last_name varchar(255) not null,
  phone_number varchar(255) not null,
  email_address varchar(255) not null,
  identification_number varchar(255) not null
);

CREATE TABLE DEPARTMENT(
  id bigserial primary key,
  name varchar(255) not null,
  country_id bigserial,
  FOREIGN KEY (country_id) REFERENCES COUNTRY(id)
);

CREATE TABLE CITY(
  id bigserial primary key,
  name varchar(255) not null,
  department_id bigserial,
  FOREIGN KEY (department_id) REFERENCES DEPARTMENT(id)
);

CREATE TABLE IDENTIFICATION_TYPE(
  id bigserial primary key,
  name varchar(255) not null
);

CREATE TABLE STATUS(
  id bigserial primary key,
  name varchar(255) not null
);

CREATE TABLE JOB_TITTLE (
    id bigserial primary key,
    title_name varchar(255) not null,
    description text
);

CREATE TABLE WORK_DEPARTMENT(
  id bigserial primary key,
  name varchar(255) not null,
  description TEXT not null,
  manager_name varchar(255) not null,
  manager_email varchar(255) not null,
  department_phone varchar(255) not null,
  insertion_date TIMESTAMP DEFAULT NOW(),
  updated_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE CUSTOMER(
  id bigserial primary key,
  name varchar(255) not null,
  last_name varchar(255) not null,
  phone_number varchar(255) not null,
  email_address varchar(255) not null,
  password varchar(255) not null,
  identification_type bigserial,
  status_id bigserial,
  role varchar(255) not null,
  created_by varchar(255) not null,
  creation_date timestamp DEFAULT NOW(),
  updated_date timestamp DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (status_id) REFERENCES STATUS(id),
  FOREIGN KEY (identification_type) REFERENCES IDENTIFICATION_TYPE(id)
);

CREATE TABLE ADDRESS(
  id bigserial primary key,
  street_address varchar(255) not null,
  postal_code varchar(255) not null,
  avenue_address varchar(255) not null,
  city_id bigserial,
  customer_id bigserial,
  FOREIGN KEY (customer_id) REFERENCES CUSTOMER(id),
  FOREIGN KEY (city_id) REFERENCES CITY(id)
);

CREATE TABLE COMPLAINTS_OFFICER(
  id bigserial primary key,
  name varchar(255) not null,
  last_name varchar(255) not null,
  phone_number varchar(255) not null,
  email_address varchar(255) not null,
  password varchar(255) not null,
  status_id bigserial,
  person_information_id bigserial,
  identification_type bigserial,
  work_apartment_id bigserial,
  job_tittle_id bigserial,
  role varchar(255) not null,
  created_by varchar(255) not null,
  creation_date timestamp DEFAULT NOW(),
  updated_date timestamp DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (status_id) REFERENCES STATUS(id),
  FOREIGN KEY (identification_type) REFERENCES IDENTIFICATION_TYPE(id),
  FOREIGN KEY (work_apartment_id) REFERENCES WORK_DEPARTMENT(id),
  FOREIGN KEY (job_tittle_id) REFERENCES JOB_TITTLE(id),
  FOREIGN KEY (person_information_id) REFERENCES PERSON_INFORMATION(id)
);

CREATE TABLE REQUEST(
 id bigserial primary key,
 name VARCHAR(255) NOT NULL,
 description TEXT,
 customer_id bigserial,
 status_id bigserial,
 created_at timestamp DEFAULT NOW(),
 updated_at timestamp DEFAULT CURRENT_TIMESTAMP,
 FOREIGN KEY (status_id) REFERENCES STATUS(id),
 FOREIGN KEY (customer_id) REFERENCES CUSTOMER(id)
);

CREATE TABLE RESPONSE(
  id bigserial primary key,
  radicate bigint,
  description TEXT,
  complaints_officer_id bigserial,
  response_date timestamp DEFAULT NOW(),
  creation_date timestamp DEFAULT NOW(),
  updated_date timestamp DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (complaints_officer_id) REFERENCES COMPLAINTS_OFFICER(id)
);
