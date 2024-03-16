package com.app.Controller;
import com.app.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieController {
    private List<Movie> listMovies;
    public MovieController() {
        this.listMovies = new ArrayList<>();
        // Aquí se inicializar la lista de películas desde una base de datos o un repositorio
    }

    public List<Movie> listMovies() {
        // Método para mostrar la lista de películas disponibles
        return listMovies;
    }


    public Movie viewDetailMovie(String Title) {
        // Método para mostrar la información detallada de una película específica
        for (Movie movie : listMovies){
            if (movie.getTitle() == Title){
                return movie;
            }
        }
        return null; // Manejar el caso en que la película no se encuentre
    }

    public void addMovie(Movie movie) {
        // Método para agregar una nueva película al sistema
        listMovies.add(movie);
    }

    public void editarPelicula(String Title, Movie MovieUpdated) {
        // Método para modificar la información de una película existente
        for (Movie movie : listMovies){
            if (movie.getTitle() == Title){
                movie.setTitle(MovieUpdated.getTitle());
                movie.setDirector(MovieUpdated.getDirector());
                movie.setGenre(MovieUpdated.getGenre());
                movie.setDuration(MovieUpdated.getDuration());
                break;
            }
        }
    }
    public void deleteMovie(String Title) {
        // Método para eliminar una película del sistema
        listMovies.removeIf(movie -> movie.getTitle()== Title);
    }
}
