package Empleados;

public class Gerente extends Empleado {

    public Gerente(String nombre, long documento){
        super(nombre, documento);
        tipo_empleado = Empleado.GERENTE;
    }
    @Override
    public String get_nombre(){
        return nombre + numero_documento;
    }
}
