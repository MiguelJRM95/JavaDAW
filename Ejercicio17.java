//Se importa el metodo JOptionPane para mostrar cuadros de dialogo
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
    

public class Ejercicio17 {
    
    public static void main(String[] args) {
        
        

            //Creamos los cuadros de diálogo para recibir la información del usuario
            String altura = JOptionPane.showInputDialog("Introduce la anchura del rectángulo, separando la parte decimal con punto");
            String anchura = JOptionPane.showInputDialog("Introduce ahora la altura, separando la parte decimal con punto");


            //Imprimimos por pantalla lo que el usuario a ingresado 
            System.out.println("La altura de tu rectángulo es: " + altura + " centímetros");
            System.out.println("La anchura de tu rectángulo es: " + anchura + " centímetros");


            try{
            
                //Transformamos las variables de tipo primitivo String en variables tipo Double (numérico de 64bits)
                double alturaNum = Double.parseDouble(altura);
                double anchuraNum = Double.parseDouble(anchura);

                //Guardamos las fórmulas en variables
                double perimetro, area;
                perimetro=2*alturaNum + 2*anchuraNum;
                area=alturaNum*anchuraNum;


                //Establecemos un límite de dos decimales para mostrar al usuario
                DecimalFormat redondeo = new DecimalFormat("#.00");

                System.out.println("El perímetro del rectángulo es: " + redondeo.format(perimetro) + " centímetros");
                System.out.println("El perímetro del rectángulo es: " + redondeo.format(area) + "  centímetros");

            } catch (java.lang.NumberFormatException e) {
                System.out.println("Solo se admiten caracteres numéricos");
            };       
    
    }

    

}
