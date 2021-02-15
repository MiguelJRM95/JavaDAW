

public class ValidarFecha {

    public static boolean esAnioBisiesto (int anio) {
            
        boolean esBisiesto = false;
            
        if (anio > 1582 & anio%4==0 & anio%100!=0) {
            esBisiesto = true;
        }
        else if(anio > 1582 & anio%400==0) {
            esBisiesto = true;
        }
            
            
        return esBisiesto;
    }

    public static boolean validarFecha(int anio, int mes, int dia) {
        
        ValidarFecha.esAnioBisiesto(anio);

        boolean fechaValida = false;

        if (anio >= 1 && anio <= 9999 && mes >= 1 && mes <= 12){
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if (dia >= 1 && dia <= 30){
                    fechaValida = true;
                }
            }
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if (dia >= 1 && dia <= 31 ){
                    fechaValida = true;
                }
            }
            if( ValidarFecha.esAnioBisiesto(anio) == true){
                if(dia >=1 && dia <=29){
                    fechaValida = true;
                }
            }else if (ValidarFecha.esAnioBisiesto(anio) == false){
                if(dia >=1 && dia <= 28){
                    fechaValida = true;
                }
            }
        }
        
        return fechaValida;
    }
}