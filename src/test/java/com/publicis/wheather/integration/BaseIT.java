package com.publicis.wheather.integration;

import org.springframework.boot.web.server.LocalServerPort;

public class BaseIT {

  @LocalServerPort
  private int port;

  protected String uri(String uri) {
    return "http://localhost:" + port + uri;
  }

}
