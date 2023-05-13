package Empleados;

public class Cocinero extends Empleado {
    
    public Cocinero(String nombre, long documento, String contraseña){
        super(nombre, documento, contraseña);
        tipo_empleado = Empleado.COCINERO;
    }

    @Override
    public int tipo_inter_grafica(){
        return 1;
    }
}
