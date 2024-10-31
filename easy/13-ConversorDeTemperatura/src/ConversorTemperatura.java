import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        System.out.println("\t\t=== MENÚ ===");
        do {
            System.out.println("Selecciona la opción deseada");
            System.out.println("1. Farenheit a Celcius\n2. Celcius a Farenheit");
            System.out.print("Ingrese selección: ");
            op = scanner.nextInt();
            if (op != 1 && op != 2){
                System.out.println("Intente nuevamente, recuerde seleccionar 1 o 2 según corresponda\n");
            }
        }while (op != 1 && op != 2);


        switch (op){
            case 1:
                System.out.print("\nIngrese los grados Farenheit que desea convertir a Celcius: ");
                float farenheit = scanner.nextFloat();
                float celcius = ((farenheit-32)*5)/9;
                System.out.println("Celcius = " + celcius);
                break;
            case 2:
                System.out.print("\nIngrese los grados Celcius que desea convertir a Farenheit: ");
                celcius = scanner.nextFloat();
                farenheit = ((celcius*9)/5)+32;
                System.out.println("farenheit = " + farenheit);
                break;
            default:
                System.out.println("No es necesario definir default porque puse las validaciones correctas con do-while");
        }
    }
}
