/*
 * Proyecto final de Programación Orientada a objetos
 * Andres Villada 20242020261
 * Tania Sanabria 20242020273
 * Alexander Garcia 20242020268
 * Clase de usuario
 */

class Usuario {
    //nombre del usuario
    private String nombre;
    private String telefono;
    //Constructor para inializar el nombre del usuario y el telefono 
    public Usuario(String nombre,String telefono) {
        this.nombre = nombre;
        this.telefono =telefono;
    }
    //Método que permite al usuario reservar reservar un espacio
    public Reserva reservar(Vehiculo vehiculo, Parqueadero parqueadero, String tipoTiempo) {
        Espacio espacio = parqueadero.buscarEspacio(vehiculo);
        //si hay disponible espacios asigna una reserva 
        if (espacio != null) {
            return new Reserva(vehiculo, espacio, tipoTiempo);
        }
        //si no hay disponibilidad no asigna nada
        return null;
    }

    //getter and setter 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
