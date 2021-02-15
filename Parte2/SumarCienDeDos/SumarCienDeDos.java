public class SumarCienDeDos {
    public static void main(String[] args) {
        
        int numInicial = 0;
        int numFinal = 0;

        while (numInicial<100){
        	numInicial = numInicial + 2;
            numFinal+=numInicial;
        }
        
        System.out.println(numFinal);

    }
}
