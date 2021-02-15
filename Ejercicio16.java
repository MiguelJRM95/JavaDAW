//Se importan dos metodos para su uso tanto para abrir entrada de teclado como para redondear decimales
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        
        //Apertura de entrada de teclado
        Scanner teclado = new Scanner(System.in);


        //Obtención de los datos que necesitamos del usuario mediante la apertura de entrada de teclado
        System.out.print("Precio inicial del artículo: " + "\n");
        double precio=teclado.nextDouble();
       
        System.out.print("Margen de beneficio ha obtener en porcentaje: " + "\n");
        double beneficio=teclado.nextDouble();
        
        System.out.print("Tipo de IVA a aplicar: " + "\n");
        double iva=teclado.nextDouble();
        
        //Se cierra la entrada de teclado
        teclado.close();

        //Variables para la operación matematica, estas variables no se pueden crear al principio del objeto main ya que no tenemos esa información aun
            double precioIva, precioFin;
            precioIva=precio + (precio*(iva)/100);
            precioFin=precioIva + (precioIva*(beneficio)/100);
            
        //Forzamos al valor a redondear a dos decimales
            DecimalFormat dec2Res = new DecimalFormat("#.00");

        //Imprimimos por pantalla los resultados finales
        System.out.println("El precio inicial del artículo es: " + precio);
        System.out.println("El precio final del artículo es: " + dec2Res.format(precioFin));
    }
}
