package com.example.myspringapi.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String emailAddress;
    private String address;
    private String role;
}
