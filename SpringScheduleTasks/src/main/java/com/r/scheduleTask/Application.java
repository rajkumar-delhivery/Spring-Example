package com.r.scheduleTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

/**
 * Created by delhivery on 26/8/16.
 */
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String arg[]) throws IOException{
        SpringApplication.run(Application.class);
    }
}
