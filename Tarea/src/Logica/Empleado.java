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
	public Empleado(String nombre, String apellido, int nroBps, int nroFuncionario, String direccion, String telefono) {	
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroBPS = nroBps;
		this.nroFuncionario = nroFuncionario;
		this.direccion = direccion;
		this.telefono = telefono;
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
	public double getSueldo(){
		
	}
	public String toString(){
        return ("Nombre: " + this.nombre + " Apellido: " + this.apellido + " Nro BPS: " + this.nroBps + " Nro Funcionario: " + this.nroFuncionario +
				 " Direccion: " + this.direccion + " Telefono: " + this.telefono);
    }
}
