//package Ejercicio10;

import java.text.DecimalFormat;

public class PuntoEspacio{

	
	private double x;
	private double y;
	
	//Constructores
	public PuntoEspacio(){

		x = 0;
		y = 0;

	}

	public PuntoEspacio(double x, double y){

		this.x = x;
		this.y = y;

	}

	//Getters y Setters
	public double getX(){

		return x;

	}

	public double getY(){

		return y;

	}

	public void setX(double x){

		this.x = x;

	}

	public void setY(double y){

		this.y = y;

	}

	//Método para mostrar coordenadas
	public void dameInfoPunto(){

		DecimalFormat dec2Res = new DecimalFormat("#.00");
		System.out.println("Posicion X: " + dec2Res.format(x) + ", Posicion Y: " + dec2Res.format(y));



	}

	public static void main(String[] args) {
		
		PuntoEspacio origen = new PuntoEspacio();
		PuntoEspacio punto1 = new PuntoEspacio(1, 5);
		PuntoEspacio punto2 = new PuntoEspacio(8, 20);
		//Semisuma de puntos extremos
		PuntoEspacio puntoMedio = new PuntoEspacio(((punto1.getX() + punto2.getX())/2) , ((punto1.getY() + punto2.getY())/2));

		origen.dameInfoPunto();
		punto1.dameInfoPunto();
		punto2.dameInfoPunto();
		puntoMedio.dameInfoPunto();

	}
}