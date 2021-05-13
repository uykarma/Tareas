package Logica;

public class EmpJornalero extends Empleado {
  //Atributos
  private double valorHora;
  private double horasTrabajadas;
  
  //Constructores
  public EmpJornalero(String nombre, String apellido, int nroBps, int nroFuncionario, String direccion, String telefono, double valorHora, double horasTrabajadas) {
    super(nombre, apellido, nroBps, nroFuncionario, direccion, telefono);
    this.valorHora = valorHora;
	  this.horasTrabajadas = horasTrabajadas;
  }
   
  //Getters y Setters
  public double getValorHora() {
	  return this.valorHora;
  }
  public void setValorHora(double valorHora) {
	  this.valorHora = valorHora;
  }   
  public double getHorasTrabajadas() {
	  return this.horasTrabajadas;
  }
  public void setHorasTrabajadas(double horasTrabajadas) {
	  this.horasTrabajadas = horasTrabajadas;
  }

  //Metodos
  public double getSueldo(){
    return valorHora * horasTrabajadas;
  }
}
