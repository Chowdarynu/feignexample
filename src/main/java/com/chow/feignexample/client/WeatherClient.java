package com.chow.feignexample.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(url = "${feign.client.url}", name="weather-service")
public interface WeatherClient {

   @GetMapping
   ResponseEntity<Map> getWeather();
}
