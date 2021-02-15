public class Temperatura{

	private double grados;

	public Temperatura(double grados){

		this.grados = grados;

	}

	public double getGrados(){

		return grados;

	}

	public void setGrados(double grados){

		this.grados = grados;

	}

	public void celsiusToFarenheit(){

		double farenheit = (1.8*grados+32);
		System.out.println(grados + " grados celsius son " + farenheit + " grados farenheit");
	}

	public void farenheitToCelsius(){

		double celsius = (1.8*grados+32);
		System.out.println(grados + " grados farenheit son " + celsius + " grados celsius");
	}

	public static void main(String[] args) {
		
		Temperatura temp1 = new Temperatura(25);

		temp1.celsiusToFarenheit();
		temp1.farenheitToCelsius();


	}


}