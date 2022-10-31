package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {

    @Autowired
    Logger LOG;


    //parametresiz constructor
   // public PostConstructTutorials(){
       // LOG.info("log info çağrıldı");
   //}


//bean henüz başlmadığından null alıyoruz ve bağımlılığı enjekte edemiyoruz.
    //post construct görevi = bir bean nesnesi oluşturulduğunda hemen oluşur.
    @PostConstruct
   public void init(){
        LOG.info("log info çağrıldı");
    }

    public static void main(String[] args) {
        PostConstructTutorials beanController = new PostConstructTutorials();
        System.out.println(beanController);
    }
}
