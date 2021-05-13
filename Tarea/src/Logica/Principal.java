package Logica;

//Utilidades
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;

public class Principal {
    public static void main (String[] args){
        LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>();
        LinkedList<EmpJornalero> listaEmpleadosJornaleros = new LinkedList<EmpJornalero>();
        LinkedList<EmpMensual> listaEmpleadosMensuales = new LinkedList<EmpMensual>();
        LinkedList<Sucursal> listaSucursales = new LinkedList<Sucursal>();
        
        //Instancias
        Sucursal sucursal1 = new Sucursal("Casa Central",1,"Montevideo","28082888","259142368838");
        listaSucursales.add(sucursal1);
        Sucursal sucursal2 = new Sucursal("Sucursal Durazno",3,"Durazno","25823698","248648282536");
        listaSucursales.add(sucursal2);

        EmpJornalero jornalero1 = new EmpJornalero("Juan","Zabala",328672,68,"Durazno","26223858",215.5,120);
        listaEmpleadosJornaleros.add(jornalero1);
        EmpJornalero jornalero2 = new EmpJornalero("Pedro","Rosen",669825,30,"Montevideo","2852639",280,100.5)
        listaEmpleadosJornaleros.add(jornalero2);

        EmpMensual mensual1 = new EmpMensual("Romina","Paito",333458,50,"Durazno","2528655",38000,"Comercial");
        listaEmpleadosMensuales.add(mensual1);
        EmpMensual mensual2 = new EmpMensual("Lucas","Manzi",225698,45,"Montevideo","2887469",38500,"Comercial");
        listaEmpleadosMensuales.add(mensual2);

        //Ingresos a lista de sucursales
        sucursal1.listaTrabajadores.add(jornalero2);
        sucursal1.listaTrabajadores.add(mensual2);

        sucursal2.listaTrabajadores.add(jornalero1);
        sucursal2.listaTrabajadores.add(mensual1);
    }
}
