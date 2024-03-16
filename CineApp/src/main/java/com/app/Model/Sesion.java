package com.app.Model;
import java.util.Date;

public class Sesion {
    private Date date;
    private Movie movie;
    private int seats;
    private int available_seats;
    private RoomCinema roomCinema;

    public Sesion() {
    }

    public Sesion(Movie movie, int seats, int available_seats, RoomCinema roomCinema, int year, int month, int day, int hour, int minutes) {
        this.movie = movie;
        this.seats = seats;
        this.available_seats = available_seats;
        this.roomCinema = roomCinema;
        date = new Date(year, month, day, hour, minutes);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(int available_seats) {
        this.available_seats = available_seats;
    }

    public RoomCinema getRoomCinema() {
        return roomCinema;
    }

    public void setRoomCinema(RoomCinema roomCinema) {
        this.roomCinema = roomCinema;
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "date=" + date +
                ", movie=" + movie +
                ", seats=" + seats +
                ", available_seats=" + available_seats +
                ", roomCinema=" + roomCinema +
                '}';
    }
}
