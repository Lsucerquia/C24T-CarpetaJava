package Otraspracticas;

public class Funciones {
    public static void main(String[] args) {
        Funciones f =new Funciones();
        System.out.println(f.suma (2,3));

        System.out.println(f.resta (10,5));

    }

        int suma (int num1,int num2){
        return num1+num2;
    }

         int resta (int num1,int num2){
         return num1-num2;
    }

}
