import java.util.Scanner;

public class EsMayuscula {

    public String cadenaUpperCase(String cadena) {
        String upperCaseCadena = cadena;
        String firstLetter, restOfWord;
        int longitud = cadena.length();

        //Recorremos el String
        for (int i = 0; i < longitud; i++) {
            if (cadena.charAt(i) == '')
            /*if (Character.isUpperCase(cadena.charAt(0))) {
                upperCaseCadena += cadena.charAt(0);
            } else {
                upperCaseCadena += cadena.substring(0, 1).toUpperCase();
            }*/

            //Probando algoritmo para la palabra 'hola'
            if (Character.isLowerCase(cadena.charAt(0))) {
                firstLetter = cadena.substring(0, 1).toUpperCase();
                restOfWord = cadena.substring(1, 4);
                upperCaseCadena = firstLetter.concat(restOfWord);
            }/* else if (cadena.charAt(i) != ' '){
                upperCaseCadena += cadena.charAt(i);
            }*/
        }
        return upperCaseCadena;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cadena = "";

        System.out.print("Ingresa una cadena: ");
        cadena = scanner.nextLine();

        // Crear una instancia de EsMayuscula
        EsMayuscula esMayuscula = new EsMayuscula();

        String upperCaseCadena = esMayuscula.cadenaUpperCase(cadena);

        //Mandamos llamar a la función
        System.out.println(upperCaseCadena);

    }
}
