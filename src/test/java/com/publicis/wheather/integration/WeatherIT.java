package com.publicis.wheather.integration;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WeatherIT extends BaseIT {

  private String uri;

  HttpHeaders headers = new HttpHeaders();
  TestRestTemplate restTemplate = new TestRestTemplate();
  ResponseEntity<?> response;


  @Before
  public void init() throws Exception {
    uri = uri("/user/sales/cart");
  }

}
