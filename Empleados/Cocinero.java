package Empleados;

public class Cocinero extends Empleado {
    
    public Cocinero(String nombre, long documento, String contraseña){
        super(nombre, documento, contraseña);
        tipo_empleado = Empleado.COCINERO;
    }

}
