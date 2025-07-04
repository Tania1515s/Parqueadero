/*
 * Proyecto final de Programación Orientada a objetos
 * Andres Villada 20242020261
 * Tania Sanabria 20242020273
 * Alexander Garcia 20242020268
 * Clase madre
 */

import java.io.Serializable;
import java.util.*;

//Nuestra clase madre que va a heredar para los 3 tipos de vehículos
//clase abstracta porque queremos que tenga metodos que directamente implementan

abstract class Vehiculo implements Serializable {
    //Se usa como identificador y codigo de acceso   
    protected String placa;
    protected Date horaEntrada;
    protected Date horaSalida;
    protected boolean esMensual;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.esMensual = false;
    }

    public void registrarEntrada(Date hora) {
        this.horaEntrada = hora;
    }

    public void registrarSalida(Date hora) {
        this.horaSalida = hora;
    }

    public void setMensual(boolean mensual) {
        this.esMensual = mensual;
    }

    public boolean esMensual() {
        return esMensual;
    }
    //Método abstracto q
    public abstract double calcularTarifa(Tarifa tarifa, String tipoTiempo);

    public String getPlaca() {
        return placa;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }
}

