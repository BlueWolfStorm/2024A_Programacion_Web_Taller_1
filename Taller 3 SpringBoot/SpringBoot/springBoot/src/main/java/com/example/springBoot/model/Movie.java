package com.example.springBoot.model;

public class Movie {
    int id;
    String title;
    String gender;
    String classification;
    float duration;
    String director;
    String synopsis;

    public Movie() {
    }

    public Movie(int id, String title, String gender, String classification, float duration, String director, String synopsis) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.classification = classification;
        this.duration = duration;
        this.director = director;
        this.synopsis = synopsis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", classification='" + classification + '\'' +
                ", duration=" + duration +
                ", director='" + director + '\'' +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }



}
