package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private User user;
    private Date hireDate;
    private String position;
    private String permission;
}
