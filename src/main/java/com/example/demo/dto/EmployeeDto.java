package com.example.demo.dto;

//DTO : Data Transfer Object

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
public class EmployeeDto {
    private Long id;
    private String firstname;
    private String Lastname;
    private String emailId;

}
