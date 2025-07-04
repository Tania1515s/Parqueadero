
/*
 * Proyecto final de Programación Orientada a objetos
 * Andres Villada 20242020261
 * Tania Sanabria 20242020273
 * Alexander Garcia 20242020268
 * Clase de reporte 
 */

import java.util.Date;
import java.util.Map;


public class Reporte {
    //Atributos
    private Date fecha;
    private int totalVehiculos;
    private double totalRecaudado;
    private Map<String, Integer> resumenPorTipo;

    //Constructor con los datos del día 
    public Reporte(Date fecha, int totalVehiculos, double totalRecaudado, Map<String, Integer> resumenPorTipo) {
        this.fecha = fecha;
        this.totalVehiculos = totalVehiculos;
        this.totalRecaudado = totalRecaudado;
        this.resumenPorTipo = resumenPorTipo;
    }
    //método para generar el reporte del día 
    public void generarReporte(){
        System.out.println("Fecha del reporte: " + fecha);
        System.out.println("Total de vehículos: " + totalVehiculos);
        System.out.println("Total recaudado: " + totalRecaudado);
        System.out.println("Resumen por tipo de vehículo:");
    }

    public Map<String, Integer> getResumenPorTipo() {
        return resumenPorTipo;
    }

}
