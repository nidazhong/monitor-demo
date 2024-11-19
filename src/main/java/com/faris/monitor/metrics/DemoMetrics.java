package com.faris.monitor.metrics;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.atomic.AtomicLong;

public class DemoMetrics implements MeterBinder {
    private AtomicLong systemMemoryUsed = new AtomicLong(0);

    //这里实现了MeterBinder接口的bindTo方法，将要采集的指标注册到MeterRegistry
    @Override
    public void bindTo(MeterRegistry registry) {
        //这里的MeterRegistry 是全局的
        Gauge.builder("system.memory.used", systemMemoryUsed, AtomicLong::get)
//              .tag("groupName", this.groupName)
                .description("系统已用内存（byte）")
                .register(registry);
    }

    //定时器，定时改变内存数值
    @Scheduled(fixedRate = 1000) // 1s写一次数据到influx
    public void recordMemory() {
        //获取内存信息，省略
        //更改内存
//        systemMemoryUsed.set(physicalUse);
    }
}
