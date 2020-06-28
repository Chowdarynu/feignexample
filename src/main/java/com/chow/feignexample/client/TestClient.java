package com.chow.feignexample.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(url="http://localhow:7777/welcome")
public interface TestClient {
    @RequestMapping(value="/welcome", method= GET)
    String welcome();

}
