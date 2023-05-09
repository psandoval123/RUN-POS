package Empleados;

public class Empleado {
    protected static final String GERENTE = "Gerente";
    protected static final String MESERO = "Mesero";
    protected static final String ADMINISTRADOR = "Administrador";
    protected static final String COCINERO = "Cocinero";
    protected String nombre;
    protected long numero_documento;
    protected String tipo_empleado;
    protected String contraseña;
    
    //Constructor para ingresar datos 
    public Empleado(String nombre, long documento, String contraseña){
        this.nombre = nombre;
        this.numero_documento = documento;
        this.contraseña = contraseña;
    }

    //Constructor para cargar el objeto de tipo empleado
    public Empleado(Empleado em){
        nombre = em.nombre;
        numero_documento = em.numero_documento;
        contraseña = em.contraseña;
    }
}
