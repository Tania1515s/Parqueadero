/*
 * Proyecto final de Programación Orientada a objetos
 * Andres Villada 20242020261
 * Tania Sanabria 20242020273
 * Alexander Garcia 20242020268
 * Clase del parqueadero 
 */


import java.io.*;
import java.util.*;

public class Parqueadero implements Serializable {
    //Lista de todos los espacios disponibles en el parquedero
    private List<Espacio> espacios = new ArrayList<>();
    //contiene las tarifas por minuto y por mes para los vehículos
    private Tarifa tarifa;

    public Parqueadero(int totalEspacios) {
        //cra una lista de espacios alternando entre automoviles,motos y camiones 
        for (int i = 0; i < totalEspacios; i++) {
            String tipo = (i % 3 == 0) ? "Automovil" : (i % 3 == 1) ? "Motocicleta" : "Camioneta";
            espacios.add(new Espacio(i + 1, tipo));
        }
    }
    //Este método recorre los espacios y devuelve la disponibilidad 
    public Espacio buscarEspacio(Vehiculo vehiculo) {
        for (Espacio e : espacios) {
            if (e.estaDisponible() && e.getTipoPermitido().equalsIgnoreCase(vehiculo.getClass().getSimpleName())) {
                return e;
            }
        }
        return null;

    }

     // Método que genera un reporte del uso diario del parqueadero
    public Reporte generarReporteDelDia(List<Reserva> reservasDelDia) {
        Date fechaHoy = new Date();
        int totalVehiculos = reservasDelDia.size();
        double totalRecaudado = 0;
        Map<String, Integer> resumenPorTipo = new HashMap<>();

        for (Reserva reserva : reservasDelDia) {
            String tipo = reserva.getVehiculo().getClass().getSimpleName();
            double tarifa = reserva.getVehiculo().calcularTarifa(this.getTarifa(), reserva.tipoTiempo);
            totalRecaudado += tarifa;

            resumenPorTipo.put(tipo, resumenPorTipo.getOrDefault(tipo, 0) + 1);
        }

        return new Reporte(fechaHoy, totalVehiculos, totalRecaudado, resumenPorTipo);
    }

    public List<Espacio> getEspacios() {
        return espacios;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }
}