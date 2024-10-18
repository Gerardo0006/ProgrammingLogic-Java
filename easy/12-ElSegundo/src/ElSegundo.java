import java.util.Scanner;

public class ElSegundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tam = 0;

        System.out.print("Ingresa el tamaño del array: ");
        tam = scanner.nextInt();

        int[] array = new int[tam];
        int may = 0, segundoMayor = 0;
        int pos = 0;

        for (int i=0; i<tam; i++){
            System.out.print("Ingresa valor para " + (i+1) + ": ");
            array[i] = scanner.nextInt();

            //Calculamos el mayor
            if (array[i] > may){
                may = array[i];
                pos = i;
            }

            //Calculamos el segundo mayor
            if (array[i] < may && array[i] > segundoMayor){
                segundoMayor = array[i];
            }

        }
        System.out.println("El número mayor es = " + may);
        //System.out.println("pos = " + pos);
        System.out.println("El segundo número mayor = " + segundoMayor);
    }
}
