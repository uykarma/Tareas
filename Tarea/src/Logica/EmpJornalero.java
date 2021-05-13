package Logica;

public class EmpJornalero extends Empleado {
    private double valorHora;
    private double horasTrabajadas;
    
    public EmpJornalero() {
    this.valorHora = 0.0;
	this.horasMes = 0.0;
    }
   
  public double getValorHora() {
	  return this.valorHora;
  }
  public void setValorHora() {
	   this.valorHora = valorHora;
  }   
     public double getHorasTrabajadas() {
	  return this.horasTrabajadas;
  }
  public void setHorasTrabajadas() {
	   this.horasTrabajadas = horasTrabajadas;
  }
}
