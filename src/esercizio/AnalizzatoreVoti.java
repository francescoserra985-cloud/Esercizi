package esercizio;
import java.util.Scanner;
public class AnalizzatoreVoti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//Variabili
		int numeroVoti;
		double somma = 0;
		double media;
		int voto;
		
		System.out.println("=== Analizzatore voti scolastici ===");
		System.out.println("Quanti voti vuoi inserire? ");
		numeroVoti = scanner.nextInt();
		
		//Ciclo FOR per inserire i voti
		int[] voti = new int[numeroVoti];
		for(int i = 0; i < numeroVoti; i++) {
			System.out.println("Inserisci il voto numero " + (i+1) + ": ");
			voti[i] = scanner.nextInt();
			somma += voti[i];
		}
		
		//operatori aritmetici e classe Math
		media = somma / numeroVoti;
		double mediaArrotondata = Math.round(media * 100.0) / 100.0;
		
		//Ricerca voto massimo e minimo con ciclo WHILE
		int max = voti[0];
		int min = voti[0];
		int indice = 1;
		while (indice < numeroVoti) {
			max = Math.max(max, voti[indice]);
			min = Math.min(min, voti[indice]);
			indice++;
		}
		System.out.println("=== Risultati ===");
		System.out.println("Media: " + mediaArrotondata);
		System.out.println("Voto massimo: " + max);
		System.out.println("Voto minimo: " + min);
		
		//operatori di comparazione e operatori logici con IF
		if(mediaArrotondata >= 6.0 && min >= 4) {
			System.out.println("Esito: PROMOSSO");
		}else if (mediaArrotondata >= 6.0 && min < 4) {
			System.out.println("Esito: DA VERIFICARE");
		}else {
			System.out.println("Esito: NON PROMOSSO");
		}
		
		//Switch per giudizio sulla media
		int fasciaMedia = (int) mediaArrotondata;
		String giudizio;
		
		switch(fasciaMedia) {
		case 10:
		case 9:
			giudizio = "Eccellente";
			break;
		case 8:
			giudizio = "Ottimo";
			break;
		case 7:
			giudizio = "Buono";
			break;
		case 6:
			giudizio = "Sufficente";
			break;
		default:
			giudizio = "Insufficente";
			break;
		
			}
		System.out.println("Giudizio: " + giudizio);
		
		scanner.close();
		
	}
}
