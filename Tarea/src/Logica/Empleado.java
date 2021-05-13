package Logica;

public class Empleado {
	//Atributos
    private String nombre;
    private String apellido;
    private int nroBps;
    private int nroFuncionario;
    private String direccion;
    private String telefono;
    
	//Constructores
	public Empleado() {	
		this.nombre = "";
		this.apellido = "";
		this.nroBPS = 0;
		this.nroFuncionario = 0;
		this.direccion = "";
		this.telefono = "";
	}
    
	//Getters y Setters
    public String getNombre() {
		return this.nombre;
	}
	public void setNombre() {
	   this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido() {
	   this.apellido = apellido;
	}
	public int getNroBps() {
	   return this.nroBps;
	}
	public void setNroBps() {
	   this.nroBPS = nroBPS;
	}   
	public int getNroFuncionario() {
	   return this.nroFuncionario;
	}
	public void setNroFuncionario() {
	   this.nroFuncionario = nroFuncionario;
	}
	public String getDireccion() {
	   return this.direccion;
	}
	public void setDireccion() {
	   this.direccion = direccion;
	}
	public String getTelefono() {
	   return this.telefono;
	}
	public void setTelefono() {
	   this.telefono = telefono;
	}

	//Metodos
	public String toString(){
        return (this.nombre + " " + this.direccion);
    }
}
