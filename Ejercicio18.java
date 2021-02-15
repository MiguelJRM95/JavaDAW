import javax.swing.JOptionPane;

public class Ejercicio18 {


    public static void main(String[] args) {
       
        String a = JOptionPane.showInputDialog("Introduce el primer número");
        String b = JOptionPane.showInputDialog("Introduce el segundo número");

        double numa = Double.parseDouble(a);
        double numb = Double.parseDouble(b);

        JOptionPane.showMessageDialog(null, "La suma de los numeros es:" + (numa + numb));

    }
}