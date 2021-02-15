import java.util.Scanner; //Importando Scanner desde su libreria

public class Ejercicio10 {
    
    public static void main(String[] args){
        //Creamos una conexion con el teclado
        Scanner teclado = new Scanner(System.in);

        //Solicitamos al usuario su nombre, tipo String
        System.out.print("¿Cómo te llamas?: " + "\n");
        String nombre=teclado.nextLine();
        
        //Solicitamos al usuario su fecha de nacimientp, tipo String
        System.out.print("Introduce tu fecha de nacimiento en formato dd/mm/aaaa: ");
        String fecha=teclado.nextLine();
        
        //Se imprime por pantalla lo que el usuario a tecleado
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Y naciste el día: " + fecha);

        teclado.close();
    }

}
