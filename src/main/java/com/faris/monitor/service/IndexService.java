package com.faris.monitor.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
    Counter counter;

    public IndexService(MeterRegistry meterRegistry) {
//        this.counter = meterRegistry.counter("call.count");
        counter = meterRegistry.counter("IndexService.call.count");

    }

    public void call() {
        // 方法调用时，计数器加1
        counter.increment();
        // ... 方法的其他逻辑
    }
}
