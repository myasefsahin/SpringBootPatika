package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {


    //http://localhost8080/thymeleaf1
    //@ResponseBody
    @GetMapping("/thymeleaf1")
    public String getThymeleafController1() {
        return "thymeleaf1";
    }



    //http://localhost8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model) {
        model.addAttribute("key_model1", "Ben model 1 den geldim");
        model.addAttribute("key_model2", "Ben model 2 den geldim");
        return "thymeleaf1";
    }


    //http://localhost8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model) {
        model.addAttribute("key_model1", "Ben model 1 den geldim");
        model.addAttribute("key_model2", "Ben model 2 den geldim");
        return "thymeleaf_file/thymeleaf3";

    }

    //http://localhost8080/thymeleaf3
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model1", "Ben model 1 den geldim");
        return "thymeleaf4";

    }
}
