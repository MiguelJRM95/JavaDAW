import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Primer número decimal");
        double numa = teclado.nextDouble();

        System.out.println("Segundo número decimal");
        double numb = teclado.nextDouble();

        teclado.close();

        DecimalFormat dec4Res = new DecimalFormat("#.0000");

        System.out.println("La suma de " + numa + " y " + numb + " es igual a " + dec4Res.format(numa + numb));
        System.out.println("La resta de " + numa + " y " + numb + " es igual a " + dec4Res.format(numa - numb));
        System.out.println("La multiplicación de " + numa + " y " + numb + " es igual a " + dec4Res.format(numa * numb));
        System.out.println("La división de " + numa + " y " + numb + " es igual a " + dec4Res.format(numa / numb));

        double cociente = numa/numb;

        int cocInt = (int)cociente;

        System.out.println("El cociente entero de " + numa + numb + " es: " + cocInt);
        

    }

}
