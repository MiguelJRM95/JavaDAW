import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        //Creamos una conexion con el teclado
        Scanner teclado = new Scanner(System.in);

        //Solicitamos al usuario su capital, tipo String
        System.out.print("¿De qué capital dispones?: " + "\n");
        Double capital=teclado.nextDouble();

        //Solicitamos al usuario la duración de la inversion, tipo String
        System.out.print("¿Cual es la duración de la inversión?: " + "\n");
        Double inversion=teclado.nextDouble();

        //Solicitamos al usuario el interés anual, tipo String
        System.out.print("¿Qué interés anual tienes?: " + "\n");
        Double interes=teclado.nextDouble();

        //Asignamos las variables para realizar los calculos
        double rendi = capital + ((capital*(1.25/100)*inversion));
        double rendf = rendi - (interes/100);

        //Forzamos al valor a redondear a dos decimales
        DecimalFormat dec2Res = new DecimalFormat("#.00");

        //Cerramos la entrada de teclado
        teclado.close();

        //Imprimimos por pantalla nuestro capital final
        System.out.println("Capital total final es: " + dec2Res.format(rendf) + "euros");
    }

    
}
