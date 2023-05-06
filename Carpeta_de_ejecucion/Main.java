package Carpeta_de_ejecucion;
import Empleados.*;

public class Main {
    public static void main(String[] args){
        Empleado juan = new Gerente("Juan David Beltran Orjuela", 1068972260);


        System.out.println(juan instanceof Mesero);
    }
}
