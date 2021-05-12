package Logica;

public class Sucursal {
    private String nombre;
    private int identificador;
    private String direccion;
    private String telefono;
    private long rut;
    LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>
    LinkedList<EmpJornalero> listaEmpleadosJornaleros = new LinkedList<EmpJornalero>
    LinkedList<EmpMensual> listaEmpleadosMensuales = new LinkedList<EmpMensual>
        
    this.nombre = "";
	this.identificador = 0;
	this.dirección = "";
	this.teléfono = "";
	this.rut = 0;
	
        
        
    public void setnombre() {
	   this.nombre = nombre;    
    }
    public String getNombre(){
        return nombre;
    }
    public void setidentificador() {
	   this.identificador = identificador;
    }     
    public int getidentificador() {
        return identificador;
    }
    public void setdirección() {
	   this.dirección = dirección;    
    }
    public String getdirección(){
        return direccion;
    }
    public void setteléfono() {
	   this.teléfono = teléfono;    
    }
    public String getteléfono(){
        return teléfono;
    }
    public void setrut() {
	   this.rut = rut;    
    }
    public long getRut(){
        return rut;
    }
}
