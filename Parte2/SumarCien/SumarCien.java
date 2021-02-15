//package coleccion4_toJava.Parte2.SumarCien;

public class SumarCien {
    public static void main(String[] args) {
        
        int numInicial = 0;
        int numFinal = 0;

        while (numInicial<100){
        	numInicial++;
            numFinal+=numInicial;
        }
        
        System.out.println(numFinal);

    }
}
