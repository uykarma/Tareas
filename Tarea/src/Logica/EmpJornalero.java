package Logica;

public class EmpJornalero extends Empleado {
  //Atributos
  private double valorHora;
  private double horasTrabajadas;
  
  //Constructores
  public EmpJornalero() {
    this.valorHora = 0.0;
	  this.horasMes = 0.0;
  }
   
  //Getters y Setters
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

  //Metodos
  public String toString(){
    return (this.nombre + " " + this.direccion);
  }
}
