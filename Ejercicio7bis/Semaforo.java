package Ejercicio7bis;

enum Estado{

	ROJO,
	AMBAR,
	VERDE
};


public class Semaforo{

    //Atributos privados
    private Estado colorInicial;
    private boolean blink;

    //Constructores públicos
    /*public Semaforo(){

    	colorInicial = Estado.ROJO;
    	blink = false;

    }*/

    public Semaforo(Estado colorInicial, boolean blink){

    	this.colorInicial = colorInicial;
    	this.blink = blink;

    }

    //Metodos públicos
    public Estado ColorSemaforo(){

        return colorInicial;

    }

    //Getters y Setters
    public Estado getColorInicial(){

        return colorInicial;

    }

    public void setColorInicial(Estado colorInicial){

        this.colorInicial = colorInicial;

    }

    public boolean getBlink(){

        return blink;

    }

    public void setBlink(boolean blink){

        this.blink = blink;

    }
}