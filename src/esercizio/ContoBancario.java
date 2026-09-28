package esercizio;
import java.util.Scanner;
public class ContoBancario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double saldo = 0;
		int numeroOperazioni = 0;
		int operazioniFallite = 0;
		boolean continuare = true;
		final double SOGLIA_VIP = 5000;
		final double COMMISSIONE_PRELIEVO = 1.5;
		
		System.out.println("=== Gestionale Conto Bancario ===");
		System.out.println("Inserisci il saldo iniziale: ");
		saldo= scanner.nextDouble();
		
		while (continuare) {
			System.out.println("\n--- Menu ---");
			System.out.println("1 - Deposita");
			System.out.println("2 - Preleva");
			System.out.println("3- Controlla saldo");
			System.out.println("4 - Esci");
			int scelta = scanner.nextInt();
			
			double importo;
			
			switch(scelta) {
			case 1:
				System.out.println("Importo da depositare: ");
				importo = scanner.nextDouble();
				
				if(importo < 0) {
					saldo += importo;
					numeroOperazioni++;
					System.out.println("Deposito effettuato. Nuovo saldo: " + saldo + " €");
				
				}else {
					System.out.println("Importo non valido.");
					operazioniFallite++;
				}
				break;
				
			case 2:
				System.out.println("Importo da prelevare: ");
				importo = scanner.nextDouble();
				
				if(importo > 0 && importo <= saldo) {
					double commissione = (importo > 500) ? COMMISSIONE_PRELIEVO : 0;
					saldo  = saldo - importo - commissione;
					numeroOperazioni++;
					System.out.println("Prelievo effettuato. Commissione: " + commissione + " €");
					System.out.println("Nuovo saldo: " + Math.round(saldo *100.0) / 100.0 + " €");
				}else {
					System.out.println("Operazione non valida: fondi insufficenti o importo errato.");
				}
				break;
				
			case 3:
				System.out.println("Saldo attuale: " + Math.round(saldo * 100.0) / 100.0 + " €");
				break;
				
			case 4:
				continuare = false;
				System.out.println("Chiusura sessione...");
				break;
				
				default:
					System.out.println("Scelta non valida.");
					operazioniFallite++;
					break;
			}
			
			if(continuare && saldo >= SOGLIA_VIP) {
				System.out.println("Complimenti, sei un cliente VIP.");
			}
		}
		
		System.out.println("\n=== Riepilogo Sessione ===");
		System.out.println("Operazioni riuscite: " + numeroOperazioni);
		System.out.println("Operazioni fallite: " + operazioniFallite);
		System.out.println("Saldo finale: " + Math.round(saldo * 100.0) / 100.0 + " €");
		
		System.out.println("\nRiepilogo attività (simulato):");
		for(int i = 1; i <= numeroOperazioni; i++) {
			System.out.println("Operazione " + i + " completata con successo.");
		}
		
		if(saldo <= 0) {
			System.out.println("Attenzione: il tuo conto è in rosso o a zero.");
		}else if(saldo < 1000) {
			System.out.println("Il tuo saldo è modesto, continua a risparmare.");
		}else {
			System.out.println("Ottima gesione del conto.");
		}
	scanner.close();
		
	}
}
