package com.liumq.dubbonacos.consumer;

import com.liumq.dubbonacos.api.Service;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dubbonacos
 * @author: liumq
 * @create: 2020-05-10 13:32
 **/
@RestController
public class ServiceClient {

    @Reference(version = "${service.version}",check = false)
    private Service service;

    @RequestMapping("/getInfo")
    public String getServiceHello()
    {
        return service.hello();
    }


    @RequestMapping("/person")
    public String getPerson()
    {
        return service.getPerson().toString();
    }
}
