package Empleados;

public class Gerente extends Empleado {

    public Gerente(String nombre, long documento, String contraseña){
        super(nombre, documento, contraseña);
        tipo_empleado = Empleado.GERENTE;
    }
    
    @Override
    public int tipo_inter_grafica(){
        return 2;
    }
}
