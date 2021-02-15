public class Semaforo{

enum Estado{

	ROJO,
	AMBAR,
	VERDE
}

Estado colorInicial = Estado.ROJO;
boolean blink = false;

public Estado ColorSemaforo(){

	return colorInicial;

}

public static void main(String[] args){

	Semaforo estadoInicial = new Semaforo();

	System.out.println("El semaforo esta en: " + estadoInicial.ColorSemaforo());

}

}