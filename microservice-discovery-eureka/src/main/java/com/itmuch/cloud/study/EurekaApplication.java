package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 使用Eureka做服务发现.
 * @author eacdy
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
  public static void main(String[] args) {
    long starTime = System.currentTimeMillis();
    SpringApplication.run(EurekaApplication.class, args);
    long endTime = System.currentTimeMillis();
    long time = endTime - starTime;
    System.out.println("\nStart Time: " + time / 1000 + " s");
    System.out.println("...............................................................");
    System.out.println("..................Service starts successfully..................");
    System.out.println("...............................................................");

  }
}
