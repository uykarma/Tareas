package Logica;

public class EmpMensual extends Empleado {
    private double salarioMensual;
    private String tipoRegimen;
    
	public EmpMensual(){
    this.salarioMensual = 0.0;
	this.tipoRegimen = "";
}
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

}
