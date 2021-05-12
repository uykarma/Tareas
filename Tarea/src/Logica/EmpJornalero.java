package Logica;

public class EmpJornalero extends Empleado {
    private double valorHora;
    private double horasTrabajadas;
    
    public EmpJornalero() {
    this.valorHora = 0.0;
	this.horasMes = 0.0;
    }
   
  public double getvalorHora() {
	  return this.valorHora;
  }
  public void setvalorHora() {
	   this.valorHora = valorHora;
  }   
     public double gethorasMes() {
	  return this.horasMes;
  }
  public void sethorasMes() {
	   this.horasMes = horasMes;
  }
}
