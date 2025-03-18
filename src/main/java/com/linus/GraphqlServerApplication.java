package com.linus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class GraphqlServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(GraphqlServerApplication.class, args);
  }
}
