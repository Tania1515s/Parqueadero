/*
 * Proyecto final de Programación Orientada a objetos
 * Andres Villada 20242020261
 * Tania Sanabria 20242020273
 * Alexander Garcia 20242020268
 * Clase Del espacio del parquedero
 */

import java.io.Serializable;
//Representa un espacio específico de parqueo 
public class Espacio implements Serializable{
     //implementa de serializable porque queremos guradar objetos {
    //Identificador único del espacio del parqu
    private int id;
    private String tipoPermitido;
    private boolean disponible = true;

    //Método constructor
    public Espacio(int id, String tipoPermitido) {
            this.id = id;
            this.tipoPermitido = tipoPermitido;
    }

    public boolean estaDisponible() {
            return disponible;
    }

    public void ocupar() {
            disponible = false;
    }

    public void liberar() {
            disponible = true;
    }
        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }
        
    public String getTipoPermitido() {
        return tipoPermitido;
    }
}
