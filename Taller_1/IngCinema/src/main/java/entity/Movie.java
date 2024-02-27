/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author srroj
 */
public class Movie {
    private  int id;
    private String title;
    private String gender;
    private String classification;
    private float duaration;
    private String synopsis;

    public Movie() {
    }
    
    

    public Movie(int id, String title, String gender, String classification, float duaration, String synopsis) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.classification = classification;
        this.duaration = duaration;
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

    public float getDuaration() {
        return duaration;
    }

    public void setDuaration(float duaration) {
        this.duaration = duaration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    public void getMovieInfo(){
    
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", title=" + title + ", gender=" + gender + ", classification=" + classification + ", duaration=" + duaration + ", synopsis=" + synopsis + '}';
    }
    
    

    
}
