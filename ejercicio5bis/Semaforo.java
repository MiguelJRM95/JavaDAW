package ejercicio5bis;

enum Estado{

	ROJO,
	AMBAR,
	VERDE
};


public class Semaforo{

    Estado colorInicial;
    boolean blink = false;

    public Estado ColorSemaforo(){

        return colorInicial;

    }
}