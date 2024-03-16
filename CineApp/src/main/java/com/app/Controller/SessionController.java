package com.app.Controller;
import com.app.Model.Sesion;

import java.util.List;
import java.util.ArrayList;
public class SessionController {
    private List<Sesion> listSessions;

    public SessionController() {
        this.listSessions = new ArrayList<>();
        // Aquí podrías inicializar la lista de sesiones desde una base de datos o un repositorio
    }

    public List<Sesion> listSession() {
        // Método para mostrar la lista de sesiones disponibles
        return listSessions;
    }

    public Sesion seeSessionDetails(String movie) {
        // Método para mostrar la información detallada de una sesión específica


        return null; // Manejar el caso en que la sesión no se encuentre
    }

    public void createSession(Sesion newSesion) {
        // Método para programar una nueva sesión para una película

    }
    public void editarSesion(int id, Sesion sessionUpdated) {
        // Método para modificar la información de una sesión existente

    }
    public void deleteSession() {
        // Método para cancelar una sesión programada
    }
}
