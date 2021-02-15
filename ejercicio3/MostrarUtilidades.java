package ejercicio3;

import ejercicio3.Utilidades.*;

public class MostrarUtilidades {

	public static void main (String[] args){

		DiasSemana diaFavorito = DiasSemana.VIERNES;

		ColoresPrimarios colorFavorito = ColoresPrimarios.ROJO;

		IdiomasEOLEmbajadores idiomaEstudiar = IdiomasEOLEmbajadores.FRANCES;

		DocumentosVotacion voto = DocumentosVotacion.DNI;


		System.out.println("Mi dia favorito es el: " + diaFavorito);
		System.out.println("Mi color favorito es el: " + colorFavorito);
		System.out.println("Este año voy a estudiar: " + idiomaEstudiar);
		System.out.println("En las próximas elecciones votaré con: " + voto);




	}

}