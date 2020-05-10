package com.liumq.dubbonacos.provider;

import com.liumq.dubbonacos.entity.Person;
import org.springframework.stereotype.Component;

/**
 * @program: dubbonacos
 * @author: liumq
 * @create: 2020-05-10 13:28
 **/
@Component
@org.apache.dubbo.config.annotation.Service(version = "${service.version}")
public class Service implements com.liumq.dubbonacos.api.Service {
    @Override
    public String hello() {
        return "hello this is procider";
    }

    @Override
    public Person getPerson() {
        Person person = new Person();
        person.setName("liumengqi");
        person.setAddress("潜阳中路");
        person.setAge(25);

        return person;
    }
}
