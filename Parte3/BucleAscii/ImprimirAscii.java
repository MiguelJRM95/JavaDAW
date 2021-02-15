public class ImprimirAscii{

	public static void imprimirAscii(){

		for(int i = 33; i<=126; i++){
			char ch = (char) i;
			if(i % 8 != 0){
				System.out.print(ch + " ");
				continue;
			}else if(i % 8 == 0){
				System.out.print(ch + "\n");
				continue;
			}
		}

	}

	public static void main(String[] args) {
		imprimirAscii();
	}
}