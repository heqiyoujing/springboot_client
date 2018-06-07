package com.example.springboot_config.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() throws Exception{
        /*ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host: " + instance.getHost() +  ", service_id:" + instance.getServiceId());
        int sleepTime = new Random().nextInt(3000);
        Thread.sleep(sleepTime);*/
        return "Hello World";
    }
}
