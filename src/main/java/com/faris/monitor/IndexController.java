package com.faris.monitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("/")
    public Map index() {
        Map<String,String> data =  new HashMap<>();
        data.put("msg","I am Monitor-Demo!");
        return data;
    }
}
