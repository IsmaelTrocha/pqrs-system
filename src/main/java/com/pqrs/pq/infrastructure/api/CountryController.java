package com.pqrs.pq.infrastructure.api;

import com.pqrs.pq.application.country.CreateCountryApplication;
import com.pqrs.pq.application.country.GetCountryApplication;
import com.pqrs.pq.domain.entities.Country;
import com.pqrs.pq.infrastructure.api.dto.request.CountryRequest;
import com.pqrs.pq.infrastructure.api.dto.response.CountryResponse;
import com.pqrs.pq.infrastructure.api.mapper.CountryRequestMapper;
import com.pqrs.pq.infrastructure.api.mapper.response.CountryResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/country")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {


  private final CreateCountryApplication createCountryApplication;
  private final CountryRequestMapper countryRequestMapper;
  private final CountryResponseMapper countryResponseMapper;
  private final GetCountryApplication getCountryApplication;

  @PostMapping
  public String createCountry(@RequestBody CountryRequest countryRequest) {
    Country country = createCountryApplication.createCountry(
        countryRequestMapper.toEntity(countryRequest));
    return "The country " + countryRequest.getName() + " was created successfully.";
  }

  @GetMapping(path = "/get/{id}")
  public ResponseEntity<CountryResponse> getCountry(@PathVariable("id") Long id) {
    return new ResponseEntity<>(countryResponseMapper.toDto(getCountryApplication.getCountry(id)),
        HttpStatus.OK);
  }

  

}
