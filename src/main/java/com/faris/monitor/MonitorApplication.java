package com.faris.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication()
public class MonitorApplication {
    public static void main(String[] args)  {
       SpringApplication.run(MonitorApplication.class, args);
    }
}
