
package persistencia;

import Kernel.Parqueadero;

import java.io.*;
public class archi{

    // Ruta del archivo donde se guardará el estado del parqueadero
    private static final String RUTA_ARCHIVO = "parqueadero.dat";

    // Método para guardar el objeto Parqueadero en un archivo
    public static void guardarParqueadero(Parqueadero parqueadero) {
        try (
                // Se crea un flujo de salida con un ObjectOutputStream
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_ARCHIVO))
        ) {
            // Se escribe el objeto en el archivo
            oos.writeObject(parqueadero);
        } catch (IOException e) {
            // En caso de error, se imprime la traza del error
            e.printStackTrace();
        }
    }

    // Método para cargar el objeto Parqueadero desde un archivo
    public static Parqueadero cargarParqueadero() {
        try (
                // Se crea un flujo de entrada con un ObjectInputStream
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCHIVO))
        ) {
            // Se lee el objeto desde el archivo y se retorna
            return (Parqueadero) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Si hay un error (como archivo no existente), se retorna null
            e.printStackTrace();
            return null;
        }
    }

}