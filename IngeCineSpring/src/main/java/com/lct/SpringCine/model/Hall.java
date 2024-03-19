package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Hall {
    private String name;
    private List<HallChair> chairList;

    public Hall(String name, List<HallChair> chairList) {
        this.name = name;
        this.chairList = chairList;
    }

}
