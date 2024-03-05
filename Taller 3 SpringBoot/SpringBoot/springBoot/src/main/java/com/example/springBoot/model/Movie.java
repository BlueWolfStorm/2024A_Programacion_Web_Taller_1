package com.example.springBoot.model;

public class Movie {

    private String title;
    private String gender;
    private String classification;
    private float duration;
    private String director;
    private String synopsis;

    public Movie() {
    }

    public Movie( String title, String gender, String classification, float duration, String director, String synopsis) {

        this.setTitle(title);
        this.setGender(gender);
        this.setClassification(classification);
        this.setDuration(duration);
        this.setDirector(director);
        this.setSynopsis(synopsis);
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
                ", title='" + getTitle() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", classification='" + getClassification() + '\'' +
                ", duration=" + getDuration() +
                ", director='" + getDirector() + '\'' +
                ", synopsis='" + getSynopsis() + '\'' +
                '}';
    }



}
