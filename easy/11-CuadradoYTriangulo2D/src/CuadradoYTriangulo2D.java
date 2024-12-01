import java.util.Scanner;

public class CuadradoYTriangulo2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la medida del lado: ");
        int lado = scanner.nextInt();

        //Imprimiendo el Cuadrado
        System.out.println("Imprimiendo Triángulo");
        for (int i=0; i<lado; i++){
            System.out.print("* ");
            for (int j=0; j<(lado-1);  j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

//        //Calculamos la base del triángulo
        String[][] matrizTriangulo = new String[lado][lado];

        // Inicializando la matriz con espacios en blanco
        for (int i = 0; i < matrizTriangulo.length; i++) {
            for (int j = 0; j < matrizTriangulo[i].length; j++) {
                matrizTriangulo[i][j] = " ";
            }
        }

        // Llenando la matriz con los asteriscos para formar un triángulo
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j <= i; j++) {
                matrizTriangulo[i][j] = "*";
            }
        }

        // Imprimiendo el Triángulo
        System.out.println("Imprimiendo Triángulo:");
        for (int i = 0; i < matrizTriangulo.length; i++) {
            for (int j = 0; j < matrizTriangulo[i].length; j++) {
                if (i==0 || i==1){
                    System.out.print("");
                }
                System.out.print(matrizTriangulo[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        //Pirámide
        System.out.println("Imprimiendo Pirámide:");
        String[][] matrizPiramide = new String[lado][lado];
        for (int i=0; i<matrizPiramide.length; i++){
            for (int j=0; j<matrizPiramide[i].length; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
