package Empleados;

public class Mesero extends Empleado {
    public Mesero(String nombre, long documento, String contraseña){
        super(nombre, documento,contraseña);
        tipo_empleado = Empleado.MESERO;
    }

    
}
