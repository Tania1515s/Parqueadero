/*
 * Proyecto final de Programación Orientada a objetos
 * Andres Villada 20242020261
 * Tania Sanabria 20242020273
 * Alexander Garcia 20242020268
 * Clase hija 
 */
import java.util.*;
//herada de la clase vehiculo 
public class Camioneta extends Vehiculo {
    public Camioneta(String placa) {
        super(placa);
    }
    //Método para calcular la tarifa 
    public double calcularTarifa(Tarifa tarifa, String tipoTiempo) {
        //dos tipos por mensualidad y por minutos 
        if (esMensual) return tarifa.getTarifa("Camioneta", "mensual");

        long minutos = (horaSalida.getTime() - horaEntrada.getTime()) / 60000;
        double tarifaMinuto = tarifa.getTarifa("Camioneta", "minuto");

        Calendar cal = Calendar.getInstance();
        cal.setTime(horaEntrada);
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        //recargo nocturno del 20%
        if (hora >= 19 || hora < 6) {
            tarifaMinuto *= 1.2;
        }

        return tarifaMinuto * minutos;
    }
}
