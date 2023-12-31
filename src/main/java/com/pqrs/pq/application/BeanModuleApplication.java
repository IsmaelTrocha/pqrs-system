package com.pqrs.pq.application;

import com.pqrs.pq.application.address.GetAllAddressApplication;
import com.pqrs.pq.application.country.CreateCountryApplication;
import com.pqrs.pq.application.country.GetCountryApplication;
import com.pqrs.pq.domain.services.address.GetAllAddressService;
import com.pqrs.pq.domain.services.country.CreateCountryService;
import com.pqrs.pq.domain.services.country.GetCountryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {


   public GetAllAddressApplication getAllAddressApplication(
      GetAllAddressService getAllAddressService) {
    return new GetAllAddressApplication(getAllAddressService);
  }

  @Bean
  public CreateCountryApplication createCountryApplication(
      CreateCountryService createCountryService) {
    return new CreateCountryApplication(createCountryService);
  }

  @Bean
  public GetCountryApplication getCountryApplication(GetCountryService getCountryService) {
    return new GetCountryApplication(getCountryService);
  }
}
