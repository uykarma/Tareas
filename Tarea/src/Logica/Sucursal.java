package Logica;

public class Sucursal {
    //Atributos
    private String nombre;
    private int identificador;
    private String direccion;
    private String telefono;
    private long rut;
    LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>();
    LinkedList<EmpJornalero> listaEmpleadosJornaleros = new LinkedList<EmpJornalero>();
    LinkedList<EmpMensual> listaEmpleadosMensuales = new LinkedList<EmpMensual>();
    
    //Constructores
    public Sucursal(){
        this.nombre = "";
	    this.identificador = 0;
	    this.direccion = "";
	    this.telefono = "";
	    this.rut = 0;
    }
    
    //Getters y Setters
    public void setNombre() {
	   this.nombre = nombre;    
    }
    public String getNombre(){
        return nombre;
    }
    public void setIdentificador() {
	   this.identificador = identificador;
    }     
    public int getIdentificador() {
        return identificador;
    }
    public void setDireccion() {
	   this.direccion = direccion;    
    }
    public String getDireccion(){
        return direccion;
    }
    public void setTelefono() {
	   this.telefono = telefono;    
    }
    public String getTelefono(){
        return telefono;
    }
    public void setRut() {
	   this.rut = rut;    
    }
    public long getRut(){
        return rut;
    }

    //Metodos
    public String toString(){
        return (this.nombre + " " + this.direccion);
    }
}
