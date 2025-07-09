package controllers;

import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private TreeMap<Empleado, Empleado> empleados ;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
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
        // buscar el empleado con el Id = id
        Empleado empleadoToRemove = null;
        for (Empleado emp : empleados.keySet()) {
            if (emp.getId() == id) {
                empleadoToRemove = emp;
                break;
            }
        }
        if (empleadoToRemove != null) {
            empleados.remove(empleadoToRemove);
            System.out.println("Empleado eliminado: " + empleadoToRemove);
        } else {
            System.out.println("No se encontró un empleado con ID: " + id);
        }
        
        
    }

  

}
