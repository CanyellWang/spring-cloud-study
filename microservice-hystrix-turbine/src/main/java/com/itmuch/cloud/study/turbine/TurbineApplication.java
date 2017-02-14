package com.itmuch.cloud.study.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 通过@EnableTurbine接口，激活对Turbine的支持。
 * @author eacdy
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApplication {
  public static void main(String[] args) {
    long starTime = System.currentTimeMillis();
    SpringApplication.run(TurbineApplication.class, args);
    long endTime = System.currentTimeMillis();
    long time = endTime - starTime;
    System.out.println("\nStart Time: " + time / 1000 + " s");
    System.out.println("...............................................................");
    System.out.println("..................Service starts successfully..................");
    System.out.println("...............................................................");

  }
}
