/*
 * Proyecto final de Programación Orientada a objetos
 * Andres Villada 20242020261
 * Tania Sanabria 20242020273
 * Alexander Garcia 20242020268
 * Clase de reserva 
 */

import java.io.Serializable;
//reserva del vehículo en el espacio
class Reserva implements Serializable { //serialiable para poder guardar objetos{
    private static final long serialVersionUID = 1L;
    //Contador para generar una identificacion única
    private static int contador = 1;
    private String idReserva;
    private Vehiculo vehiculo;
    private Espacio espacio;
    public String tipoTiempo;
    // Código de acceso generado para esta reserva, basado en la placa del vehículo.
    private String codigoAcceso;

    //Método constructor
    public Reserva(Vehiculo vehiculo, Espacio espacio, String tipoTiempo) {
        this.idReserva = "RES" + (contador++); //Al momento de buscar el archivo con la reservar organizamos los datos 
        this.vehiculo = vehiculo;
        this.espacio = espacio;
        this.tipoTiempo = tipoTiempo;
        this.codigoAcceso = vehiculo.getPlaca();
        espacio.ocupar(); //Marca un espacio como ocupado al reservar 
    }

    //Getters y setters
    public String getCodigoAcceso() {
        return codigoAcceso;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Espacio getEspacio() {
        return espacio;
    }
}