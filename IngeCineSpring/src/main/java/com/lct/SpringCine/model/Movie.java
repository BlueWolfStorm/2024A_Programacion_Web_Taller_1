package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Movie {
    private int duration;
    private String imageUrl, title, director, synopsis, studio;
    private List<String> cast;
    private LocalDate releaseYear;
    private Genre genre;

    public Movie(int id, int duration, String imageUrl, String title, String director, String synopsis, String studio, List<String> cast, LocalDate releaseYear, Genre genre) {
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
}
