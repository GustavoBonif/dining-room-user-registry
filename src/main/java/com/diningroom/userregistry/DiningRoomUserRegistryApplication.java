package com.diningroom.userregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DiningRoomUserRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiningRoomUserRegistryApplication.class, args);
    }

}
