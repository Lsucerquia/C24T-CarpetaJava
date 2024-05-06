package C24B5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StreamEnJavaEjer5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> pares = numerosPares(numeros);
        System.out.println("Mostrar numeros pares" + pares);
    }

    public static List<Integer> numerosPares(List<Integer>numeros){
        List<Integer> pares =new ArrayList<>();

        for (Integer numero:numeros){
            if (numero%2==0){
                pares.add(numero);

            }

        }

        return pares;
    }


}


