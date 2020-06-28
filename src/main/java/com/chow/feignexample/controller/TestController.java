package com.chow.feignexample.controller;

import com.chow.feignexample.client.WeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class TestController {

   @Autowired
   private WeatherClient weatherClient;

   @GetMapping("/test")
   public ResponseEntity<Map> get() {
      return weatherClient.getWeather();
   }
}
