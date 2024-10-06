import java.util.Scanner;

public class ConversorTiempo {

    //Función que retorna el total de milisegundos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days, hours, minutes, seconds, miliseconds = 0;
        int milisecondsInSecond = 1000;
        int milisecondsInHour = 3600000;
        int milisecondsInDays = 3600000;
        int milisecondsInMinute;

        System.out.print("Ingresa segundos: ");
        seconds = scanner.nextInt();
        System.out.print("Ingresa minutos: ");
        minutes = scanner.nextInt();
//        System.out.print("Ingresa horas: ");
//        hours = scanner.nextInt();
//        System.out.print("Ingresa días: ");
//        days = scanner.nextInt();

        milisecondsInSecond = (milisecondsInSecond)*seconds;
        milisecondsInMinute = (milisecondsInSecond)*(60*minutes);
//        milisecondsInDays = (milisecondsInHour)*24;

        System.out.println("milisecondsInSecond = " + milisecondsInSecond);
        System.out.println("milisecondsInMinute = " + milisecondsInMinute);
    }
}
