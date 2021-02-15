import java.text.DecimalFormat;
import java.lang.Math.*;

public class PuntoEspacio{

	
	private double puntoX;
	private double puntoY;
	
	//Constructores
	public PuntoEspacio(){

		puntoX = 0;
		puntoY = 0;

	}

	public PuntoEspacio(double puntoX, double puntoY){

		this.puntoX = puntoX;
		this.puntoY = puntoY;

	}

	//Getters y Setters
	public double getX(){

		return puntoX;

	}

	public double getY(){

		return puntoY;

	}

	public void setX(){

		this.puntoX = puntoX;

	}

	public void setY(){

		this.puntoY = puntoY;

	}

	//Método para mostrar coordenadas
	public void dameInfoPunto(){

		DecimalFormat dec2Res = new DecimalFormat("#.00");
		System.out.println("Posicion X: " + dec2Res.format(puntoX) + ", Posicion Y: " + dec2Res.format(puntoY));

	}

	//Metodo para calcular distancia de dos coordenadas
	public double calcularDistancia(double coor_x, double coor_y){

		return Math.sqrt(Math.pow((coor_x - puntoX), 2) + Math.pow((coor_y - puntoY), 2));

	}

	//Metodo para calcular distancia al origen de coordenadas
	public double calcularDistanciaOrigen(){

		return Math.sqrt(Math.pow((0 - puntoX), 2) + Math.pow((0 - puntoY), 2));

	}


	public static void main(String[] args) {

		//Formato decimal para distancias
		DecimalFormat dec2Res = new DecimalFormat("#.00");
		
		PuntoEspacio origen = new PuntoEspacio();
		PuntoEspacio punto1 = new PuntoEspacio(1, 5);
		PuntoEspacio punto2 = new PuntoEspacio(8, 20);
		PuntoEspacio puntoSimetrico = new PuntoEspacio(-3, -4);
		
		//Semisuma de puntos extremos
		PuntoEspacio puntoMedio = new PuntoEspacio(((punto1.getX() + punto2.getX())/2) , ((punto1.getY() + punto2.getY())/2));

		/*Imprimiendo por pantalla las coordenadas de los puntos
		origen.dameInfoPunto();
		punto1.dameInfoPunto();
		punto2.dameInfoPunto();
		puntoMedio.dameInfoPunto();*/

		/*Calculando distancias segun un punto de coordenadas dado
		origen.calcularDistancia(3, 4);
		puntoSimetrico.calcularDistancia(3, 4);
		punto2.calcularDistancia(3, 4);*/
		
		//Imprimiendo por pantalla las distancias
		System.out.println("Distancia al (0,0): " + origen.calcularDistancia(3, 4));
		System.out.println("Distancia al (-3,-4): " + puntoSimetrico.calcularDistancia(3, 4));
		System.out.println("Distancia de origen al (8,20): " + dec2Res.format(punto2.calcularDistanciaOrigen()));

	}
}