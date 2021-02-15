/*
* Solución del ejercicio2, colección 2
* @author Mauricio Rodríguez

package coleccion2;

enum TipoPintura {

        METALIZADO, NOMETALIZADO
    };
    enum TipoAutomovil {
        MINI, UTIL, FAMILIAR, DEPORTIVO
    };

 public class Automovil {

    String modelo;

    String color;

    TipoPintura pintura;

    int año;

    TipoAutomovil tipoAuto;


public void mostrarModYCol (){

    System.out.println ("El modelo vehículo es : "+ modelo + "\n" + 
            "El color del vehículo es: "+ color);

}

public static void main (String[]args){

Automovil miauto;
miauto = new Automovil ();
miauto.modelo = "Lamborghini Aventator";
miauto.color = "Amarillo";
System.out.println ("Los datos de mi vehículo son: ");
miauto.mostrarModYCol();


}
}*/


package ejercicio1y2;

public class Automovil {

	enum Pintura
	{

		METALIZADA,
		NO_METALIZADA

	}

	enum TipoAutomovil
	{

		MINI,
		UTILITARIO,
		PICK_UP,
		FAMILIAR,
		DEPORTIVO

	}
	Pintura tipopint = Pintura.NO_METALIZADA;
	TipoAutomovil tipoaut = TipoAutomovil.PICK_UP;
	String modelo;
	String color;
	int anioFabricacion;

	public String mostrarModelo(){

		//String modelo = "Ford Bronco";
		return modelo;
	}

	public String mostrarColor(){

		//String color = "Negro";
		return color;

	}

	public static void main(String[] args) {

		Automovil ford = new Automovil();

		ford.color = "Negro";
		ford.modelo = "Ford Bronco";
		
		System.out.println("Modelo: " + ford.modelo + "\n" + "Color: " + ford.color);
		//System.out.println("Modelo: " + ford.mostrarModelo() + "\n" + "Color: " + ford.mostrarColor());

	}

}