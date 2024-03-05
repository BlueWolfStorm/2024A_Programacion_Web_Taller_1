/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tatan
 */
public class Movie {

    private int id;
    private String name;
    private String genre;
    private String director;
    private String actors;
    private int duration;
    private String rating;
    private String synopsis;
    private String releaseDate;

    public Movie() {
        this.id = 0;
        this.name = "";
        this.genre = "";
        this.director = "";
        this.actors = "";
        this.duration = 0;
        this.rating = "";
        this.synopsis = "";
        this.releaseDate = "";
    }

    public Movie(int id, String name, String genre, String director, String actors, int duration, String rating, String synopsis, String releaseDate) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.duration = duration;
        this.rating = rating;
        this.synopsis = synopsis;
        this.releaseDate = releaseDate;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", duration=" + duration +
                ", rating='" + rating + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}

