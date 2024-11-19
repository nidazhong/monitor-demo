package com.faris.monitor.metrics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricsConfig {

    @Bean
    public DemoMetrics demoMetrics(){
        return new DemoMetrics();
    }
}
