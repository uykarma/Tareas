package Logica;

//Utilidades
import java.util.LinkedList;

public class Sucursal {
    //Atributos
    private String nombre;
    private int identificador;
    private String direccion;
    private String telefono;
    private String rut;
    LinkedList<Empleado> listaTrabajadores;
    
    //Constructores
    public Sucursal(String nombre, int identificador, String direccion, String telefono, String rut, LinkedList<Empleado> listaTrabajadores){
        this.nombre = nombre;
	    this.identificador = identificador;
	    this.direccion = direccion;
	    this.telefono = telefono;
	    this.rut = rut;
        this.listaTrabajadores = listaTrabajadores;
    }
    
    //Getters y Setters
    public void setNombre(String nombre) {
	   this.nombre = nombre;    
    }
    public String getNombre(){
        return nombre;
    }
    public void setIdentificador(int identificador) {
	   this.identificador = identificador;
    }     
    public int getIdentificador() {
        return identificador;
    }
    public void setDireccion(String direccion) {
	   this.direccion = direccion;    
    }
    public String getDireccion(){
        return direccion;
    }
    public void setTelefono(String telefono) {
	   this.telefono = telefono;    
    }
    public String getTelefono(){
        return telefono;
    }
    public void setRut(String rut) {
	   this.rut = rut;    
    }
    public String getRut(){
        return rut;
    }

    //Metodos
    public String toString(){
        return (this.nombre + " " + this.direccion);
    }
}
