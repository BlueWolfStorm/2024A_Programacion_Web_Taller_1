package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Hall {
    private int id;
    private String name;
    private List<HallChair> chairList;

    public Hall(int id, String name, List<HallChair> chairList) {
        this.id = id;
        this.name = name;
        this.chairList = chairList;
    }

}
