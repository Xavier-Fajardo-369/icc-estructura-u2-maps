package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }
    public void runHashMap() {
        Map<String, String> mapa = new HashMap();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        for (String key : mapa.keySet()) {
            System.out.println( " Valor-> " + mapa.get(key));
        }
        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005")); 
        
    }
    public void runLinkedHashMap() {
        //crear un mapa con claves numeros y valor nombre de personas solo nombres de personas
        //Integer -> String
        //Agregen 5 elementos e imprimir todos los valores
        Map<Integer, String> mapa = new LinkedHashMap();
        mapa.put(1, "Xavier");
        mapa.put(2, "Juan");
        mapa.put(3, "Maria");
        mapa.put(4, "Ana");
        mapa.put(5, "Pedro");
        System.out.println("Valores del mapa:");
        for (String value : mapa.values()) {
            System.out.println(value);
        }
        
       
    }
    public void runTreeMap() {
        Map<Integer, String> items = new TreeMap();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");
        //imprime los valores
        System.out.println("Valores del TreeMap:");
        for (String value : items.values()) {
            System.out.println(value);
        }  
    }
    public void runHashMapObj() {
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);
        System.out.println(empleados); 
        
    }
    public void runTreeMapObj() {
        Map<Empleado, Integer> empleados = new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);
        for (Empleado empleado : empleados.keySet()) {
            System.out.println("Id: " + empleado.getId() + 
                               ", Nombre: " + empleado.getName() + 
                               ", Cargo: " + empleado.getPosition() + 
                               ", Salario: " + empleados.get(empleado));
           
        }
    }
    
    
}
