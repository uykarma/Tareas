package Logica;

public class EmpMensual extends Empleado {
    private double salarioMensual;
    private String tipoRegimen;
    
    this.salarioMensual = 0.0;
	this.tipoRegimen = "";

    public double getsalarioMensual() {
		  return this.salarioMensual;
	  }
	  public void setsalarioMensual() {
		   this.salarioMensual = salarioMensual;
	  }   
	  public double gettipoRegimen() {
		  return this.tipoRegimen;
	  }
	  public void settipoRegimen() {
		   this.tipoRegimen = tipoRegimen;
	  }

}
