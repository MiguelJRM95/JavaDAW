public class Ejercicio14{
    
            public static void main (String[] args){
            //empezamos por declarar las variables necesarias
            int a=3, b=6, c;
            c= a/b;
            System.out.println( "El valor de c es: " + c); //c=0.5
            c= a%b;
            System.out.println( "El valor de c es: " + c); //c=0
            a++;
            System.out.println( "El valor de a es: " + a); //a=3
            ++a;
            System.out.println( "El valor de a es: " + a); //a=4
            c= ++a + b++;
            System.out.println( "El valor de a es: " + a); //a=4
            System.out.println( "El valor de b es: " + b); //b=6
            System.out.println( "El valor de c es: " + c); //c=10
            c= ++a + ++b;
            System.out.println( "El valor de a es: " + a);//a=4
            System.out.println( "El valor de b es: " + b);//b=7
            System.out.println( "El valor de c es: " + c);//c=11
        } //fin del main
    }
