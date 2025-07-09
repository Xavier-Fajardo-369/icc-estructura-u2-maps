package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;
   

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() { 
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
        
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
        /* 
        int result = Integer.hashCode(id);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
        */
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Empleado empleado = (Empleado) obj;
        return this.id == empleado.id;
        /* 
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Empleado empleado = (Empleado) obj;
        return id == empleado.id &&
               (name != null ? name.equals(empleado.name) : empleado.name == null);
        */
        
      
    }
    @Override
    public int compareTo(Empleado emp) {
        int idComparison = Integer.compare(id, emp.id);
        if (idComparison != 0) {
            return idComparison;
        }
        // como son iguales los ids, comparamos por nombre
        return name.compareTo(emp.getName());
       
    }
    
}