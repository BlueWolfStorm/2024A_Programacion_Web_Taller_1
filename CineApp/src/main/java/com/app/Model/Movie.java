package com.app.Model;

public class Movie {
    private String Title;
    private String Director;
    private String Genre;
    private int Duration;

    public Movie() {
    }

    public Movie(String title, String director, String genre, int duration) {
        Title = title;
        Director = director;
        Genre = genre;
        Duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Title='" + Title + '\'' +
                ", Director='" + Director + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Duration=" + Duration +
                '}';
    }
}
