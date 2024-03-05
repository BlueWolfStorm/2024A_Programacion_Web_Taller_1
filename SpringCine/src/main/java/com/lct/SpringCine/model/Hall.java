package org.ingecine.model;

import java.util.List;

public class Hall {
    private int id;
    private String name;
    private List<HallChair> chairList;

    public Hall(){}

    public Hall(int id, String name, List<HallChair> chairList) {
        this.id = id;
        this.name = name;
        this.chairList = chairList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HallChair> getChairList() {
        return chairList;
    }

    public void setChairList(List<HallChair> chairList) {
        this.chairList = chairList;
    }
}
