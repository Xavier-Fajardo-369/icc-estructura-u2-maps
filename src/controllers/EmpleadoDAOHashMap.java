package controllers;

import java.util.HashMap;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private HashMap<Empleado, Empleado> empleados ;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
        
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
        
        
    }

    @Override
    public void list() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado emp : empleados.values()) {
                System.out.println(emp);
            }
        }    
    }

    @Override
    public void remove(int id) {
        Empleado toRemove = null;
        for (Empleado emp : empleados.keySet()) {
            if (emp.getId() == id) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null) {
            empleados.remove(toRemove);
        } else {
            System.out.println("Empleado con id " + id + " no encontrado.");
        }
    }
    

 
    

}
