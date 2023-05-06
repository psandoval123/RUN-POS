package Empleados;

public class Mesero extends Empleado {
    public Mesero(String nombre, long documento){
        super(nombre, documento);
        tipo_empleado = Empleado.MESERO;
    }
}
