package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 使用@EnableFeignClients开启Feign
 * @author eacdy
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MovieFeignApplication {
  public static void main(String[] args) {
    long starTime = System.currentTimeMillis();
    SpringApplication.run(MovieFeignApplication.class, args);
    long endTime = System.currentTimeMillis();
    long time = endTime - starTime;
    System.out.println("\nStart Time: " + time / 1000 + " s");
    System.out.println("...............................................................");
    System.out.println("..................Service starts successfully..................");
    System.out.println("...............................................................");

  }
}
