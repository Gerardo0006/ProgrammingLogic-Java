import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        int dividendo;
        int cociente = 0;
        int residuo = 0, bin = 0;
        String stringBinario = "", binario = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular su equivalente en binario: ");
        dividendo = scanner.nextInt();

        while (dividendo > 1) {
            residuo = dividendo % 2;
            dividendo = dividendo / 2;
            stringBinario = Integer.toString(residuo);
            binario = stringBinario + binario;
        }
        System.out.println(dividendo + binario);
    }
}
