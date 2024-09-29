import java.util.Scanner;

public class InvirtiendoCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reverseString = " ";

        System.out.print("Ingresa la cadena: ");
        String string = scanner.nextLine();

        int length = string.length();

        //Lógica para invertir la cadena
        for (int i=length-1; i>=0; i--){
            reverseString += string.charAt(i);
        }

        System.out.println("reverseString = " + reverseString);
    }
}
