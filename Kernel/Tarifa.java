/*
 * Proyecto final de Programación Orientada a objetos
 * Andres Villada 20242020261
 * Tania Sanabria 20242020273
 * Alexander Garcia 20242020268
 * Clase para la tarifa
 */

import java.io.*;
import java.util.*;

//Maneja el tipo de tarifa por vehiculo y para las dos modalidades 
class Tarifa implements Serializable {
    //Guarda las tarifas por minuto de cada vehiculo
    private Map<String, Double> porMinuto = new HashMap<>();//Los mapas nos permiten maneja r datos de tipo clave valor, e impide que se repita la clave 
    //Guarda las tarifas mensuales por vehiculo
    private Map<String, Double> porMes = new HashMap<>();

    //Asigna una tarifa por tipo de vehiculo 
    public void establecerTarifa(String tipoVehiculo, double minuto, double mes) {
        porMinuto.put(tipoVehiculo, minuto);
        porMes.put(tipoVehiculo, mes);
    }
    //Retorna la tarifa según el tipo de tiempo(Mensual o minutos)
    public double getTarifa(String tipoVehiculo, String tipoTiempo) {
        if (tipoTiempo.equalsIgnoreCase("mensual")) {
            return porMes.getOrDefault(tipoVehiculo, 0.0);
        } else {
            return porMinuto.getOrDefault(tipoVehiculo, 0.0);
        }
    }
}
