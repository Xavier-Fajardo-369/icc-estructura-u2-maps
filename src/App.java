import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Xavier Fajardo"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();
        runEmpleadoExample();
        runEjerccios();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreeMapObj();

    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDaoHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoControllerHash = new EmpleadoContoller(empleadoDaoHash);
        EmpleadoDAO empleadoDaoTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoControllerTree = new EmpleadoContoller(empleadoDaoTree);
        Empleado emp1 = new Empleado(1, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1, "Juan", "DEV");
        empleadoControllerHash.agregarEmpleado(emp1);
        empleadoControllerHash.agregarEmpleado(emp2);
        empleadoControllerHash.agregarEmpleado(emp3);
        empleadoControllerHash.agregarEmpleado(emp4);
        empleadoControllerHash.agregarEmpleado(emp5);
        empleadoControllerTree.agregarEmpleado(emp1);
        empleadoControllerTree.agregarEmpleado(emp2);
        empleadoControllerTree.agregarEmpleado(emp3);
        empleadoControllerTree.agregarEmpleado(emp4);
        empleadoControllerTree.agregarEmpleado(emp5);
        empleadoControllerHash.list();
        empleadoControllerHash.remove(2);
        empleadoControllerHash.list();
        empleadoControllerTree.list();
        empleadoControllerTree.remove(2);
        empleadoControllerTree.list();
       
        



        
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();
        int[] nums = {9, 2, 3, 6};
        int objetivo = 5;
        int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (resultado != null) {
            System.out.println("Indices que suman " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron indices que sumen " + objetivo);
        }
        String palabra1 = "roma";
        String palabra2 = "amor";
        boolean sonAnagramas = ejercicios.sonAnagramas(palabra1, palabra2);
        System.out.println("¿Son anagramas '" + palabra1 + "' y '" + palabra2 + "'? " + sonAnagramas);
        String texto = "hola";
        System.out.println("Frecuencia de caracteres en '" + texto + "':");
        ejercicios.contarCaracteres(texto);


    }
}
