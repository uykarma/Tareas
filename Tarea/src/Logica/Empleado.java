package Logica;

public class Empleado {
    private String nombre;
    private String apellido;
    private int nroBps;
    private int nroFuncionario;
    private String direccion;
    private String telefono;

    
public Empleado() {
		
		this.nombre = "";
		this.apellido = "";
		this.númeroBPS = 0;
		this.númeroFuncionario = 0;
		this.dirección = "";
		this.teléfono = "";
}
    
    public String getnombre() {
		   return this.nombre;
	   }
	   public void setnombre() {
		   this.nombre = nombre;
	   }
	   public String apellido() {
		   return this.apellido;
	   }
	   public void setapellido() {
		   this.apellido = apellido;
	   }
	   public int getnúmeroBPS() {
		   return this.númeroBPS;
	   }
	   public void setnúmeroBPS() {
		   this.númeroBPS = númeroBPS;
	   }   
	   public int getnúmeroFuncionario() {
		   return this.númeroFuncionario;
	   }
	   public void númeroFuncionario() {
		   this.númeroFuncionario = númeroFuncionario;
	   }
	   public String dirección() {
		   return this.dirección;
	   }
	   public void setdirección() {
		   this.dirección = dirección;
	   }
	   public String getteléfono() {
		   return this.teléfono;
	   }
	   public void setteléfono() {
		   this.teléfono = teléfono;
	   }
}
