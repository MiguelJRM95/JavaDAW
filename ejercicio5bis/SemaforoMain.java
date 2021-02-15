package ejercicio5bis;

public class SemaforoMain {
    public static void main(String[] args){

        Semaforo Sem1 = new Semaforo();
        Sem1.colorInicial = Estado.ROJO;
        System.out.println("El semaforo esta en: " + Sem1.ColorSemaforo());
    
        //Semaforo Sem2 = new Semaforo();
        Sem1.colorInicial = Estado.AMBAR;
        System.out.println("El semaforo ahora esta en: " + Sem1.ColorSemaforo());
    
    }
}
