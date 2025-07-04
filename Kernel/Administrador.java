/*
 * Proyecto final de Programación Orientada a objetos
 * Andres Villada 20242020261
 * Tania Sanabria 20242020273
 * Alexander Garcia 20242020268
 * Clase de admin 
 */

//Tiene permisos para establecer tarifas y gestionar reportes 
/**
 * @
 */
public class Administrador {
    //Atributos
    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    //Establece las tarifas fijas pata cada tipo de vehiculo 
    public void establecerTarifas(Parqueadero parqueadero) {
        Tarifa tarifa = new Tarifa();
        tarifa.establecerTarifa("Automovil", 0.10, 200.0);
        tarifa.establecerTarifa("Motocicleta", 0.05, 100.0);
        tarifa.establecerTarifa("Camioneta", 0.15, 300.0);
        parqueadero.setTarifa(tarifa);
    }

    //getter and setter 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
