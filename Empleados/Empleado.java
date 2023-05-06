package Empleados;

public class Empleado {
    protected static final String GERENTE = "Gerente";
    protected static final String MESERO = "Mesero";
    protected static final String ADMINISTRADOR = "Administrador";
    protected static final String COCINERO = "Cocinero";
    protected String nombre;
    protected long numero_documento;
    protected String tipo_empleado;
    

    public Empleado(String nombre, long documento){
        this.nombre = nombre;
        this.numero_documento = documento;
    }

    public String get_nombre(){
        return nombre;
    }
}
