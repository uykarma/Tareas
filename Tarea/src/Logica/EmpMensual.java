package Logica;

public class EmpMensual extends Empleado {
    //Atributos
	private double salarioMensual;
    private String tipoRegimen;
    
	//Constructores
	public EmpMensual(){
    	this.salarioMensual = 0.0;
		this.tipoRegimen = "";
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
