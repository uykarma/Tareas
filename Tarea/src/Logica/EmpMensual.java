package Logica;

public class EmpMensual extends Empleado {
    //Atributos
	private double salarioMensual;
    private String tipoRegimen;
    
	//Constructores
	public EmpMensual(String nombre, String apellido, int nroBps, int nroFuncionario, String direccion, String telefono, double salarioMensual, String tipoRegimen){
		super(nombre, apellido, nroBps, nroFuncionario, direccion, telefono);
    	this.salarioMensual = salarioMensual;
		this.tipoRegimen = tipoRegimen;
	}

	//Getters y Setters
    public double getSalarioMensual() {
		return this.salarioMensual;
	}
	public void setSalarioMensual() {
		this.salarioMensual = salarioMensual;
	}   
	public double getTipoRegimen() {
		return this.tipoRegimen;
	}
	public void setTipoRegimen() {
		this.tipoRegimen = tipoRegimen;
	}

	//Metodos
	public String toString(){
        return (this.nombre + " " + this.direccion);
    }
}
