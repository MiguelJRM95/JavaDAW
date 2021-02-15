public class PromedioArray {
	
	public static void main(String[] args) {
		
		double[] myArr = new double[args.length];
		for(int i = 0; i< args.length; i++) {
			myArr[i] = Double.parseDouble(args[i]);
			
		}
		
		System.out.println(Utilidades.promedioArray(myArr));
		
		
	}
	
}
