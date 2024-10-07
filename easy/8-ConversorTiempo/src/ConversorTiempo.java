import java.util.Scanner;

public class ConversorTiempo {

    //Función que retorna el total de milisegundos
    public static long ReturnTotalMilisecond(int seconds, int minutes, int hours, int days){
        long totalMiliseconds = 0L;
        int milisecondsInSecond = 1000;
        int milisecondsInMinute, milisecondsInHour, milisecondsInDay;

        //Calculo de milisegundos en segundos, días, horas, días
        milisecondsInSecond *= seconds;
        milisecondsInMinute = (1000)*(60*minutes);
        milisecondsInHour = (1000)*(3600*hours);
        milisecondsInDay = (1000)*(86400*days);
        totalMiliseconds = (milisecondsInSecond+milisecondsInMinute+milisecondsInHour+milisecondsInDay);

        return totalMiliseconds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days, hours, minutes, seconds;
        long totalMiliseconds;

        System.out.print("Ingresa segundos: ");
        seconds = scanner.nextInt();
        System.out.print("Ingresa minutos: ");
        minutes = scanner.nextInt();
        System.out.print("Ingresa horas: ");
        hours = scanner.nextInt();
        System.out.print("Ingresa días: ");
        days = scanner.nextInt();

        totalMiliseconds = ReturnTotalMilisecond(seconds, minutes, hours, days);
        System.out.println("totalMiliseconds = " + totalMiliseconds);
    }
}