package com.example.demo.tutorials.bean.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String benaData;



    //başlangıç
    public void initialBeanMethod(){
        log.info("\"Bean başlamadan önce ben varım ");
        System.out.println("Bean başlarken çalışacak method");
    }

    //bitiş
    public void destroyBeanMethod(){
        log.info("\"Bean bittikten sonra ben varım  ");
        System.out.println("Bean biterken çalışacak method");
    }


}
