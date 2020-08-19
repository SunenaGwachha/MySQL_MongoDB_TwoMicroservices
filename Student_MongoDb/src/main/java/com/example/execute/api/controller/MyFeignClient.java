package com.example.execute.api.controller;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="address-service", url = "http://localhost:9092/")
public interface MyFeignClient {

    @GetMapping(value = "getAddress")
  	String getAddress();

}

