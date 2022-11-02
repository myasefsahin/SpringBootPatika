package com.example.demo.tutorials.bean.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

public class TeacherDto {
    private Long teacherİd;
    @NotEmpty(message = "ad soyad alanını boş geçemezsiniz")
    @Size(min = 1,max = 255)
    private String teacherNameSurname;

    @NotEmpty(message = "email")
    @Email(message = "uygun formatta e-mail girmediniz")
    private String teacherEmail;

    @NotEmpty(message = "şifre alanını boş geçemezsiniz")
    //@Min(value = 10,message = "minimum 10 karakter girebilirsiniz")
    //@Max(value = 18,message = "maksimum 18 karakter girebilrisiniz ")
    @Size(min = 10,max=18)
    private String teacherPassword;


}
