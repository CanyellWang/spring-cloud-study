package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {
  public static void main(String[] args) {
    long starTime = System.currentTimeMillis();
    SpringApplication.run(ConfigClientApplication.class, args);
    long endTime = System.currentTimeMillis();
    long time = endTime - starTime;
    System.out.println("\nStart Time: " + time / 1000 + " s");
    System.out.println("...............................................................");
    System.out.println("..................Service starts successfully..................");
    System.out.println("...............................................................");

  }
}
