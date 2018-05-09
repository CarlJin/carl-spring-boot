package com.ss.po;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2018-05-08 下午2:13
 **/
@Component
public class Persion {

    @Value("${persion.name}")
    private String name;

    @Value("${persion.age}")
    private String age;

    @Value("${persion.desc}")
    private String desc;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
