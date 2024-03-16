package com.app.Model;

import java.util.List;

public class Employee {
    private String name;
    private String booth;
    private List<String> tasks;

    public Employee() {
    }

    public Employee(String name, String booth, List<String> tasks) {
        this.name = name;
        this.booth = booth;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBooth() {
        return booth;
    }

    public void setBooth(String booth) {
        this.booth = booth;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", booth='" + booth + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
