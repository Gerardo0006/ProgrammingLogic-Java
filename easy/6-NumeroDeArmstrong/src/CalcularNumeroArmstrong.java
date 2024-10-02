import java.util.Scanner;

public class CalcularNumeroArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declaración de algunas variables
        int suma = 0;
        double potenciaDigito;

        //Solicitamos el número para realizar el cálculo
        System.out.print("Ingresa un número para verificar si es número de Armstrong: ");
        int num = scanner.nextInt();
        String numString = String.valueOf(num);

        //Calculamos la longitud del número ingresado para determinar la cantidad de veces que se elevará un digito a x potencia
        int longitud = numString.length();

        //Lógica para calcular la potencia de cada digito
        for (int i=0; i<longitud; i++){
            potenciaDigito = Math.pow(Character.getNumericValue(numString.charAt(i)), longitud);
            suma += potenciaDigito;
        }

        System.out.println("suma potencias = " + suma);

        //Lógica para determinar si el núemro ingresado es un número de Armstrong o no
        if (suma == num){
            System.out.println("El número [" + num + "] SÍ es un número de Armstrong");
        } else {
            System.out.println("El número [" + num + "] NO es un número de Armstrong");
        }

    }
}
