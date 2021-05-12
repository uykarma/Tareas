package Logica;

public class Sucursal {
    private String nombre;
    private int identificador;
    private String direccion;
    private String telefono;
    private long rut;
    LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>
    LinkedList<EmpJornalero> listaEmpleadosJornaleros = new LinkedList<EmpJornalero>
    LinkedList<EmpMensual> listaEmpleadosMensuales = new LinkedList<EmpMensual>

    public String getNombre(){
        return nombre;
    }
    public int getIdentificador() {
        return identificador;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public long getRut(){
        return rut;
    }
}
