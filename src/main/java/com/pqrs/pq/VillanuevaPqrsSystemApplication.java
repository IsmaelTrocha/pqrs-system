package com.pqrs.pq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VillanuevaPqrsSystemApplication {

  public static void main(String[] args) {
    SpringApplication.run(VillanuevaPqrsSystemApplication.class, args);
  }

}
