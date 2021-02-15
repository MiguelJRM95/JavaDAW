public class Ejercicio6y7 {
    
    public static void main (String[] args){
        //Declaracion de variables
        double inversion;
        inversion=3000;

        double ren1, ren2, renTot, capTot;
        ren1=37.5;
        ren2=(37.5/2);
        renTot=18.75 - (18.75*0.18);
        capTot= inversion + renTot;

        

        //Impresión de datos en pantalla
        System.out.println("El capital inicial que invertimos es de" + inversion + " euros");
        System.out.println("Durante 1 año y a un 1,25% de interés, nos rendiría " + ren1 + " euros");
        System.out.println("Como lo tenemos invertido 6 meses (medio año), nos rendirá " + ren2 + " euros");
        System.out.println("Hacienda descuenta el 18% del rendimientp, con lo que en realidad obtenemos " + renTot + " euros");
        System.out.println("Al final, nuestro capital total es de " + capTot + " euros");
    }

}
