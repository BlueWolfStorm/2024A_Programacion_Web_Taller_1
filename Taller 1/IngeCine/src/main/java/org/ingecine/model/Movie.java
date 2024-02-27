package org.ingecine.model;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private int id, duration;
    private String imageUrl, title, director, synopsis, studio;
    private List<String> cast;
    private LocalDate releaseYear;
    private Genre genre;

    public Movie() {
    }

    public Movie(int id, int duration, String imageUrl, String title, String director, String synopsis, String studio, List<String> cast, LocalDate releaseYear, Genre genre) {
        this.id = id;
        this.duration = duration;
        this.imageUrl = imageUrl;
        this.title = title;
        this.director = director;
        this.synopsis = synopsis;
        this.studio = studio;
        this.cast = cast;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
