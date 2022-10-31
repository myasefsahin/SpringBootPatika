package com.example.demo.bean;

import com.example.demo.Dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDto(){
        return BeanDto.builder().id(0L).beanName("bean adı").benaData("bean data").build();
    }
}
