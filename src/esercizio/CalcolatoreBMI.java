package esercizio;
import java.util.Scanner;
public class CalcolatoreBMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//variabili
		double peso;
		double altezza;
		double bmi;
		int eta;
		boolean continuare = true;
		int numeroCalcoli = 0;
		
		System.out.println("=== Calcolatore BMI e Consigli Fitness ===");
		
		//Ciclo WHILE principale
		while(continuare) {
			System.out.println("\nInserisci il tuo peso (kg): ");
			peso = scanner.nextDouble();
			
			System.out.println("Inserisci la tua altezza (m): ");
			altezza = scanner.nextDouble();
			
			System.out.println("Inserisci la tua età: ");
			eta = scanner.nextInt();
			
			//Operatori aritmetici e classe Math
			bmi = peso / Math.pow(altezza, 2);
			bmi = Math.round(bmi * 100.0) / 100.0; //arrotonda a 2 decimali
			
			numeroCalcoli++;
			
			System.out.println("\nIl tuo BMI è: " + bmi);
			
			//Determinare fascia BMI con  IF e operatori di comparazione
			String categoria;
			if(bmi < 18.5) {
				categoria = "Sottopeso";
			}else if (bmi >= 18.5 && bmi < 25) {
				categoria = "Normopeso";
			}else if (bmi >= 25 && bmi < 30) {
				categoria = "Sovrappeso";
			}else  {
				categoria = "Obesità";
			}
			System.out.println("Categoria: " + categoria);
			
			//operatori logici per un consiglio aggiuntivo basato su erà e BMI
			if (eta < 18 && bmi >= 25) {
				System.out.println("Attenzione: si consiglia di consultare un pediatra.");
			}else if (eta >= 65 || bmi < 18.5) {
				System.out.println("Si consiglia un controllo medico.");
			}
			
			//SWITCH oer dare un consiglio di attività fisica in base alla categoria
			String consiglio;
			switch (categoria) {
			case "Sottopeso":
				consiglio = "Aumenta l'apporto calorico e fai esercizi di forza.";
				break;
			case "Normopeso":
				consiglio = "Mantieni uno stile di vita attivo ed equilibrato.";
				break;
			case "Sovrappeso":
				consiglio = "Cerca di fare più attività aerobica, come camminare o correre.";
				break;
			case "Obesità":
				consiglio = "Consulta un nutrizionista per un piano alimentare personalizzato.";
				break;
			default:
				consiglio = "Nessun consiglio disponibile";
				break;
			}
			System.out.println("Consiglio: " + consiglio);
			
			//Ciclo FOR per stampare un piano di allenamento settimanale simulato
			System.out.println("\nPiano di allenamento suggerito (7 giorni):");
			for (int giorno = 1; giorno <=7; giorno++) {
				if (giorno % 2 == 0) {
					System.out.println("Giorno " + giorno + ": Riposo attivo (stretching, camminata leggera)");
				}else {
					System.out.println("Giorno " + giorno + ": Allenamento (cardio + forza)");
				}
			}
			
			//Chiedere se continuare
			System.out.println("\nVuoi calcolare un altro BMI? (1 = Si, 2 = No)");
			int risposta = scanner.nextInt();
			continuare = (risposta == 1);
		}
		System.out.println("\nHai effettuato " + numeroCalcoli + " calcoli. Grazie per aver usato il programma!");
		scanner.close();
	}

}
