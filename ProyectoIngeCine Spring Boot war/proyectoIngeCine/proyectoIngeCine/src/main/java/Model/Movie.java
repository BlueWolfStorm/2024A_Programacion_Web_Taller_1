/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.Duration;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Movie {
    String movieId;
    String name;
    String description;
    String rating;
    String ageRange;
    Date startDate;
    Date finalDate;
    Duration duration;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Movie(String movieId, String name, String description, String rating, String ageRange, Date startDate, Date finalDate, Duration duration) {
        this.movieId = movieId;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.ageRange = ageRange;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.duration = duration;
    }
    
    
    
}
