import java.util.Scanner;

public class EliminandoCaracteres {

    public static String eliminarCaracteres(String str1, String str2){
        int longitud1 = str1.length(), longitud2 = str2.length();
        String out1 = "";

        for (int i=0; i<longitud1; i++){
            for (int j=0; j<longitud2; i++){
                if (str1.charAt(i) == str2.charAt(j)){
                    break;
                } else if ((str1.charAt(i)))
            }
        }

        return out1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = "", str2 = "";

        System.out.print("Ingresa la cadena 1: ");
        str1 = scanner.next();
        System.out.print("Ingresa la cadena 2: ");
        str2 = scanner.next();

        String deleteChar = eliminarCaracteres(str1, str2);
    }
}
