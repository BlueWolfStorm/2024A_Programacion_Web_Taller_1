package com.app.Controller;

import com.app.Model.Employee;

import java.util.ArrayList;
import java.util.List;
public class EmployeeController {
    private List<Employee> employeel;

    public EmployeeController() {
        this.employeel = new ArrayList<>();
    }
    public void registerEmployee(String name, String booth) {
        //Metodo para registrar empleados
    }

    public void assignTaskByCharge(String booth, String task) {
        // Metodo para asignar tareas a los empleados
    }

    public void registrarAsistencia(String nameEmployee, String sesion) {
        // Lógica para registrar la asistencia de un empleado a una sesión
    }
}
