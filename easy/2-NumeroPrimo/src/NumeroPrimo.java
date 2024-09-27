public class NumeroPrimo {
    public static void main(String[] args) {
        //boolean esPrimo = false;
        /*for (int i = 1; i < 101; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 4 == 0 || i % 5 == 0 || i % 6 == 0 ||
                    i % 7 == 0 || i % 8 == 0 || i % 9 == 0) {
                if (i % 1 == 0 && i % i == 0) {
                    esPrimo = true;
                    continue;
                }
            }
            if (esPrimo) {
                System.out.println("i = " + i);
            }
        }*/
        for (int i = 2; i <= 100; i++) {  // Comenzamos desde 2 porque 1 no es primo
            boolean esPrimo = true;       // Asumimos que el número es primo
            for (int j = 2; j <= Math.sqrt(i); j++) {  // Verificamos divisores hasta la raíz cuadrada de i
                if (i % j == 0) {
                    esPrimo = false;  // Si encontramos un divisor, no es primo
                    break;            // Salimos del bucle ya que no es necesario seguir verificando
                }
            }
            if (esPrimo) {
                System.out.println("i = " + i);  // Si sigue siendo primo, lo imprimimos
            }
        }
    }
}
