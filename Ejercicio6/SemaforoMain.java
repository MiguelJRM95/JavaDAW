package Ejercicio6;

public class SemaforoMain {
    public static void main(String[] args){

        Semaforo Sem1 = new Semaforo();  
        System.out.println("El semaforo esta en: " + Sem1.ColorSemaforo());
    
        Semaforo Sem2 = new Semaforo(Estado.VERDE, false);
        System.out.println("El semaforo ahora esta en: " + Sem2.ColorSemaforo());
    
    }
}
