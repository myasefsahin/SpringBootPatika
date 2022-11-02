package com.example.demo.tutorials.bean;

import com.example.demo.tutorials.bean.Dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    @Scope("singleton")
    //@Scope("request")
    //@Scope("session")

    public BeanDto beanDto(){
        return BeanDto.builder().id(0L).beanName("bean adı").benaData("bean data").build();
    }
}
