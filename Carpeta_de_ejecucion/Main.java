package Carpeta_de_ejecucion;
import Empleados.*;

public class Main {
    public static void main(String[] args){
        Empleado juan = new Empleado("Juan David Beltran Orjuela", 1068972260);


        System.out.println(juan.get_nombre());
    }
}
