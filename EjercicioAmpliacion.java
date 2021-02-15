//Se importa las funciones de la libreria de java
import javax.swing.JOptionPane;
import java.text.DecimalFormat; //tras correccion se importa este paquete


public class EjercicioAmpliacion {
    public static void main(String[] args) {

        //Forzamos al valor a redondear a dos decimales
        DecimalFormat dec2Res = new DecimalFormat("#.00");
        
        //Se crea el primer cuadro de dialogo en el cual se pregunta esa C (capital) inicial y se muestra por pantalla
        String capital= JOptionPane.showInputDialog("Introduce el capital inicial");
		JOptionPane.showMessageDialog(null, "El capital inicial es: " + capital); 
        double capNum = Double.parseDouble(capital);

        //En este segundo cuadro se pregunta los años a calcular la devaluacion en dichos años
        int años = Integer.parseInt(JOptionPane.showInputDialog("¿Por cuántos años desea realizar el cálculo?")); //Realizamos casting forzado al dato que nos recoge el cuadro de dialogo para tener el tipo de dato que deseamos usar
            //String años = JOptionPane.showInputDialog("¿Por cuántos años desea realizar el cálculo?");  =======> version anterior primero se recogia el numero de años como string
        JOptionPane.showMessageDialog(null, "El cálculo se realizará sobre: " + años);
            //double añosNum = Double.parseDouble(años); =====> Una vez obtenido se hacia casting a double, sin necesidad, ya que los años son numeros enteros
        
        //Creación de variables numericas para mostrar el calculo
        double ipc, devaluacion, dividendo, dividendoTot;
        ipc=2.2833;
        dividendo=(1 + ipc/100);
        dividendoTot= Math.pow(dividendo, años);
        devaluacion= capNum/dividendoTot;


        //Cuadro final donde se muestra cuando es el capital total final
        JOptionPane.showMessageDialog(null, "El capital inicial es: " + capital + " euros dentro de " + años + " años será de " +  dec2Res.format(devaluacion) + " euros");
    }
}
