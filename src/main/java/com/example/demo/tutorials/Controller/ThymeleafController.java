package com.example.demo.tutorials.bean.Controller;

import com.example.demo.tutorials.bean.Dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {


    @GetMapping("/")
    public String index() {
        return "index";
    }

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

    //http://localhost8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model1", "Ben model 1 den geldim");
        return "thymeleaf4";

    }


    //////////////////////////////////////////////////////////////
    /////////Modelde Object Göndermek


    //http://localhost8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5Model(Model model) {
        ProductDto productDto = ProductDto.builder().productID(0l).productName("Ürün adı").productPrice(2500).build();

        model.addAttribute("key_model2", productDto);
        return "thymeleaf5";
    }


    //////////////////////////////////////////////////////////////
    /////////Modelde Object list Göndermek


    //http://localhost8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeleaf6ModelList(Model model) {
        model.addAttribute("key_model1", "text");
        List<ProductDto> listem = new ArrayList<>();
        listem.add(ProductDto.builder().productID(0l).productName("Ürün adı1").productPrice(1500).build());
        listem.add(ProductDto.builder().productID(1l).productName("Ürün adı2").productPrice(2500).build());
        listem.add(ProductDto.builder().productID(2l).productName("Ürün adı3").productPrice(3500).build());
        listem.add(ProductDto.builder().productID(3l).productName("Ürün adı4").productPrice(4500).build());
        model.addAttribute("product_liste", listem);
        return "thymeleaf6";
    }


    //http://localhost8080/thymeleaf7
    @GetMapping({"/thymeleaf7", "/thymeleaf7/{id}"})
    public String getThymeleaf7Model(Model model, @PathVariable(name = "id", required = false) Long id) {
        if (id != null) {
            model.addAttribute("key_model1", "id :" + id);
        } else {
            model.addAttribute("key_model1", "id bulunamadı");
        }

        return "thymeleaf7";
    }

    //http://localhost8080/thymeleaf8?id=4
    //RequestParam
    @GetMapping("/thymeleaf8")
    public String getThymeleaf8Model(Model model,
                                     @RequestParam(name = "id",required = false,defaultValue ="0") Long id,
                                     @RequestParam(name = "name") String adı
    ) {
        if (id != null) {
            model.addAttribute("key_model1", "id :" + id+ "adı soyadı : "+ adı );
        } else if (id==0){
            model.addAttribute("key_model1", "default value");
        }
        else {
            model.addAttribute("key_model1", "id bulunamadı");
        }


        return "thymeleaf8";
    }


}
