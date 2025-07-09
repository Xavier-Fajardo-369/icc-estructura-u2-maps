package controllers;

import models.Empleado;

public class EmpleadoContoller {
    EmpleadoDAO empleadoDAO ;


    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
        
    }
     public void agregarEmpleado(Empleado emp) {
        empleadoDAO.add(emp);
    }

    public void list() {
        empleadoDAO.list();
    }

    public void remove(int id) {
        empleadoDAO.remove(id);
    }
    
    
}