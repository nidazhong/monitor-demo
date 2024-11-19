package com.faris.monitor.controller;

import com.faris.monitor.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @RequestMapping("/")
    public Map index() {
        Map<String,String> data =  new HashMap<>();
        data.put("msg","I am Monitor-Demo!");
        return data;
    }


    @RequestMapping("/call")
    public Map call() {
        Map<String,String> data =  new HashMap<>();
        data.put("code","0");
        data.put("msg","请求成功");
        //记录请求次数
        indexService.call();
        return data;
    }

}
