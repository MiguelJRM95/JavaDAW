import java.security.SecureRandom;
import java.util.Arrays;

public class ApuestaPrimitiva {
	
	public static int[] apuestaPrimitiva(){
		int[] primitiva = new int[7];
		SecureRandom rand = new SecureRandom();
		for(int i = 0; i< primitiva.length-1;i++) {
			int numerito = rand.nextInt(49)+1;
			primitiva[i] = numerito;
		}
		for(int i = 0; i<primitiva.length-1;i++) {
			for(int j = 0; j<primitiva.length-2;j++){
				if(primitiva[i]==primitiva[j]) {
					primitiva[j] = rand.nextInt(49)+1;
				}
			}
			
		}
		int reintegro = rand.nextInt(10);
		primitiva[6] = reintegro;
		return primitiva;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString( Utilidades.apuestaPrimitiva()));
	}
}
