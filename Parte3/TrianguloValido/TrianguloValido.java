
public class TrianguloValido {
	
	public static String esTrianguloValido(int a, int b, int c) {
		
		String valTriangulo = " ";
		
		if (a>0 & b>0 & c>0){
			valTriangulo = ((a+b>c) & (b+c>a) & (a+c>b))? "Triangulo Valido" :  "No puede ser un triangulo";
			}
		else {
			
			System.out.println("No existe un triángulo con números negativos");
		}
		
		return valTriangulo;
	}
}
