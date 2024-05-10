package C24B3;

import java.util.Scanner;

public class ArregloEjercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] edades = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }


        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
            System.out.println(edad);

        }
        double promedio = (double) sumaEdades / edades.length;


        System.out.printf("El promedio de edades es:" + promedio);

        scanner.close();
    }

}
