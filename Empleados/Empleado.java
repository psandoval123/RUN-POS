package Empleados;

public abstract class Empleado {
    protected static final String GERENTE = "Gerente";
    protected static final String MESERO = "Mesero";
    protected static final String ADMINISTRADOR = "Administrador";
    protected static final String COCINERO = "Cocinero";
    protected String nombre;
    protected long numero_documento;
    protected String tipo_empleado;
    protected String contraseña;
    protected String nombre_usuario;
    
    //Constructor para ingresar datos 
    protected Empleado(String nombre, long documento, String contraseña){
        this.nombre = nombre;
        this.numero_documento = documento;
        this.contraseña = contraseña;
    }

    //Constructor para cargar el objeto de tipo empleado
    protected Empleado(Empleado em){
        nombre = em.nombre;
        numero_documento = em.numero_documento;
        contraseña = em.contraseña;
    }

    //Metodo a implementar
    abstract public int tipo_inter_grafica();
}
