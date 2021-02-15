package Ejercicio6;

enum Estado{

	ROJO,
	AMBAR,
	VERDE
};


public class Semaforo{

    Estado colorInicial;
    boolean blink;

   public Semaforo(){

    	colorInicial = Estado.ROJO;
    	blink = false;

    }

    public Semaforo(Estado colorInicial, boolean blink){

    	this.colorInicial = colorInicial;
    	this.blink = blink;

    }

    public Estado ColorSemaforo(){

        return colorInicial;

    }
}