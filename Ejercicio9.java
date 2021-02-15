//Importamos el metodo Math para usar la constante Pi
import java.lang.Math;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        //Declaración de variables para el calculo
        double pi = Math.PI;
        double radio, altura, volumen, superficie;
        radio= 5.0;
        altura= 10.0;
        volumen=pi*radio*radio*altura;
        superficie=(2*pi*radio*altura)+(2*pi*radio*radio);

        //Salida de resultados por pantalla
        System.out.println("Las dimensiones del rectangulo son las siguientes: ");
        System.out.println("Altura:" + altura + " centímetros");
        System.out.println("Radio: " + radio + " centímetro");
        System.out.println("Superficie total del cilindro: " + superficie + " centímetros");
        System.out.println("Volumen total del cilindro: " + volumen + " centímetros");

    }

}
