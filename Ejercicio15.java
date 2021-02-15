import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        //Creamos una conexion con el teclado
        Scanner teclado = new Scanner(System.in);

        //Pedimos al usuario la cantidad de segundos a calcular
        System.out.print("Introduce un número de segundos: " + "\n");
        Integer segundos = teclado.nextInt();
        teclado.close(); //cerramos la entrada de teclado

        //Transformamos el numero entero a double para trabajar con decimales
        double segDouble = segundos;

        //Forzamos al valor a redondear a uno, dos y tres decimales
        DecimalFormat dec1Res = new DecimalFormat("#.0");
        DecimalFormat dec2Res = new DecimalFormat("#.00");
        DecimalFormat dec3Res = new DecimalFormat("#.000");
        
        //Calculo de minutos, horas y dias
        double minutos = segDouble/60;
        double horas = minutos/60;
        double dias = horas/24;

        //Imprimiendo las conversiones por pantalla
        System.out.println("Número de segundos: " + segDouble);
        System.out.println("Número de minutos: " + dec1Res.format(minutos));
        System.out.println("Número de horas: " + dec2Res.format(horas));
        System.out.println("Número de días: " + dec3Res.format(dias));
    }

}
