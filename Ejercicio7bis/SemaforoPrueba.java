package Ejercicio7bis;

public class SemaforoPrueba{

	 public static void main(String[] args) {
            
        Semaforo sem1 = new Semaforo(Estado.ROJO, false);

        System.out.println("Semaforo 1: ");
        System.out.println("Estado: " + sem1.getColorInicial() + "\t" + "¿Parpadea?" + sem1.getBlink());

        sem1.setColorInicial(Estado.AMBAR);
        sem1.setBlink(true);

        System.out.println("Semaforo 2: ");
        System.out.println("Estado: " + sem1.getColorInicial() + "\t" + "¿Parpadea?" + sem1.getBlink());
        


    }

}