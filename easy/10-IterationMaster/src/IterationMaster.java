import java.util.stream.IntStream;

public class IterationMaster {
    public static void main(String[] args) {
        
        //Imprimiendo 1-100 con bucle For
        System.out.println("Imprimiendo del 1-100 con bucle For");
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + (i+1));
        }

        System.out.println("------------------------");

        //Imprimiendo 1-100 con bucle While
        System.out.println("Imprimiendo del 1-100 con bucle While");
        int i=0;
        while (i<100){
            System.out.println("i = " + (i+1));
            i++;
        }

        System.out.println("------------------------");

        //Imprimiendo 1-100 con bucle Do-While
        System.out.println("Imprimiendo del 1-100 con bucle Do-While");
        int j = 0;
        do {
            System.out.println("j = " + (j+1));
            j++;
        } while (j<100);

        System.out.println("------------------------");

        //Imprimiendo 1-100 con clase InStream método rangeClosed con parámetros 1, 100
        IntStream.rangeClosed(1, 100).forEach(System.out::println);
    }
}
