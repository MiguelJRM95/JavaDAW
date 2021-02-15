import java.security.SecureRandom;
import java.util.Scanner;

public class ApuestaQuiniela {

	public static char[] apuestaQuiniela(int unos, int doses, int equis) {
		char[] quiniela = new char[14];
		char[] simbolos = { '1', 'X', '2' };
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		SecureRandom rand = new SecureRandom();
		
		while (cont1 < unos || cont2 < equis || cont3 < doses) {
			for (int i = 0; i < quiniela.length; i++) {
				if (quiniela[i] == '\0') {
					int orquilla = rand.nextInt(3);
					if (simbolos[orquilla] == '1' && cont1 < unos) {
						quiniela[i] = simbolos[orquilla];
						cont1++;
					}
					if (simbolos[orquilla] == 'X' && cont2 < equis) {
						quiniela[i] = simbolos[orquilla];
						cont2++;
					}
					if (simbolos[orquilla] == '2' && cont3 < doses) {
						quiniela[i] = simbolos[orquilla];
						cont3++;
					}
				}
			}
		}
		return quiniela;
	}

	public static void main(String[] args) {

		int unos = 0;
		int doses = 0;
		int equis = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos equipos locales ganarán");
		unos = teclado.nextInt();
		System.out.println("Cuantos equipos visitantes ganarán");
		doses = teclado.nextInt();
		System.out.println("Cuantos empates habrá");
		equis = teclado.nextInt();

		int sumaTot = unos + doses + equis;

		if (unos >= 0 && equis >= 0 && doses >= 0 && sumaTot == 14) {
			System.out.println(apuestaQuiniela(unos, doses, equis));
		} else {
			System.out.println("Combinación de apuestas no validas");
		}
		teclado.close();

	}

}
