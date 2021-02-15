package Ejercicio7;

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