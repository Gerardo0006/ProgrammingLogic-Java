import java.util.ArrayList;
import java.util.Scanner;

public class Conjuntos {

    public static int[] RetornaArray(int[] array1, int[] array2, boolean bool){
        int[] resultadoArrays = {};
        ArrayList<Integer> arrayFinal = new ArrayList<>();
        if (bool){
            int index = 0;
            for (int i=0; i<array1.length; i++){
                for (int j=0; j<array2.length; j++){
                    if (array1[i] == array2[j]){
                        arrayFinal.add(array1[i]);
                        index++;
                        break;
                    }
                }
            }
        }

        resultadoArrays = arrayFinal.toArray(resultadoArrays);

        //Imprimimos el arrayFinal
//        for (int index=0; index<arrayFinal.size(); index++){
//            System.out.print("[" + arrayFinal.get(index) + "]");
//        }

        for (int i = 0; i < resultadoArrays.length; i++) {
            System.out.println("[" + resultadoArrays[i] + "]");
        }


        return arrayFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 5, 7, 9};
        int[] finalArray = new int[];
        int decision;
        boolean bool = false;

        //Algoritmo para contar el núemro de coincidencias

        do {
            System.out.println("Seleccione el valor de bool");
            System.out.println("Verdadero ------------ 1");
            System.out.println("Falso ---------------- 2");
            System.out.print("Ingrese su selección: ");
            decision = scanner.nextInt();

            if (decision == 1){
                bool = true;
                System.out.println("bool = " + bool);
                break;
            }
            if (decision == 2){
                bool = false;
                System.out.println("bool = " + bool);
                break;
            } else if (decision != 1 && decision != 2){
                System.out.println("Opción incorrecta, intente de nuevo");
            }
        }while (decision != 1 || decision != 2);

        finalArray = RetornaArray(array1, array2, bool);
        System.out.println("finalArray = " + finalArray);
    }
}
