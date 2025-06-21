import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Los nombres ingresados son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}