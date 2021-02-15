import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un solo caracter: ");
        char caracter=teclado.next().charAt(0);
        int ascii1 = caracter;

        System.out.println("Su código ASCII asociado es: " + ascii1);


        System.out.print("Introduce un valor entero de 0 a 255: ");
        int num=teclado.nextInt();
        char ascii2 = (char)num;
        System.out.println("Su caracter ASCII asociado es: " + ascii2);

        teclado.close();
    }
}
