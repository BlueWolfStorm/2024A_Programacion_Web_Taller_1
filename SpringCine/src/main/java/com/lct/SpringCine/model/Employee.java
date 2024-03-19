package com.lct.SpringCine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private User user;
    private LocalDate hireDate;
    private String position;
    private String permission;
}
