import java.util.Scanner;

public class EsMayuscula {

    public String cadenaUpperCase(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return cadena; // Manejo de cadenas vacías o nulas
        }

        String[] palabras = cadena.split(" "); // Dividir la cadena en palabras
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                String primeraLetra = palabra.substring(0, 1).toUpperCase(); // Primera letra en mayúscula
                String restoPalabra = palabra.substring(1); // Resto de la palabra
                resultado.append(primeraLetra).append(restoPalabra).append(" "); // Construir resultado
            }
        }

        return resultado.toString();
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
