package com.example.springBoot.model;

import java.util.ArrayList;
import java.util.List;
@lombok.Getter
@lombok.Setter
public class Hall {

    private int number;
    private List<Chair> chairs ;

    public Hall() {
    }

    public Hall( int number) {
        this.number = number;
        this.chairs = new ArrayList<Chair>();
    }


    public List<Chair> getChairs() {
        if(chairs == null){
            chairs = new ArrayList<Chair>();
        }
        return chairs;
    }



    @Override
    public String toString() {
        return "Hall{" +
                "number=" + number +
                ", chairs=" + chairs +
                '}';
    }
}
