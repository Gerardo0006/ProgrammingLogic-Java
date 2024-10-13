import java.util.Scanner;

public class CuadradoYTriangulo2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la medida del lado: ");
        int lado = scanner.nextInt();

        for (int i=0; i<lado; i++){
            System.out.print("* ");
//            for (int j=0; j<(lado-1);  j++){
//                System.out.print("* ");
//            }
//            System.out.println();
        }
    }
}
