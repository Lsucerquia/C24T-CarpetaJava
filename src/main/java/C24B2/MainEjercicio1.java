package C24B2;

import java.util.Scanner;

public class MainEjercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donde vives?");
        String ciudad =scanner.next();
        System.out.println(ciudad + " es la mejor ciudad?");

        System.out.println("Cual es tu edad?");
        String edad =scanner.next();
        System.out.println("mi edad es " + edad + " años");

        System.out.println("Cual es tu numero de telefono?");
        String telefono =scanner.next();
        System.out.println("Mi numero de telefono es " + telefono);

        System.out.println("Cual es tu estudio mas reciente?");
        String estudio = scanner.next();
        System.out.println("Mi estudio mas reciente es: " + estudio);


        scanner.close();


    }
}
