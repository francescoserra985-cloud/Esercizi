package esercizio;
import java.util.Scanner;
public class IndovinaNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Variabili
		int numeroSegreto;
		int tentativo;
		int numeroTentativi;
		int tentativiMassimi;
		int punteggioTotale = 0;
		int partiteGiocate = 0;
		boolean giocareAncora = true;
		boolean indovinato;
		
		System.out.println("=== Indovina il numero ===");
		
		//Cicli WHILE principale per giocare più partite
		while(giocareAncora) {
			
			//genera un numero segreto casuale da 1 a 100 (Math.random)
			numeroSegreto = (int) (Math.random() * 100) + 1;
			numeroTentativi = 0;
			tentativiMassimi = 7;
			indovinato = false;
			
			System.out.println("\nHo pensato un numero fra 1 e 100.");
			System.out.println("Hai " + tentativiMassimi + " tentativi per indovinarlo.");
			
			//Ciclo FOR per limitare il numero di tentativi
			for(int i = 1; i <= tentativiMassimi && !indovinato; i++) {
				
				System.out.println("\nTentativo " + i + "/" + tentativiMassimi + ": ");
				tentativo = scanner.nextInt();
				numeroTentativi++;
				
				//operatori di comparazione e IF
				if(tentativo == numeroSegreto) {
					indovinato = true;
					System.out.println("Complimenti hai indovinato!");
				}else if (tentativo < numeroSegreto) {
					System.out.println("Troppo basso!");
				}else {
					System.out.println("Troppo alto!");
				}
				
				//Operatori logici: suggerimento se vicino al numero segreto
				int distanza = Math.abs(tentativo - numeroSegreto);
				if(!indovinato && distanza <= 5 && distanza > 0) {
					System.out.println("Sei molto vicino...");
				}
			}
			
			//Calcolo punteggio con SWITCH in base ai tentativi usati
			int punteggioPartita;
			if(indovinato) {
				switch(numeroTentativi) {
				case 1:
					punteggioPartita = 100;
					break;
				case 2:
				case 3:
					punteggioPartita = 70;
					break;
				default:
					punteggioPartita = 20;
					break;
					
				}
				System.out.println("Hai indovinato in " + numeroTentativi + " tentativi.");
			}else {
				punteggioPartita = 0;
				System.out.println("\nHai esaurito i tentativi. Il numero era: " + numeroSegreto);
			}
			System.out.println("Punti ottenuti: " + punteggioPartita);
			
			//Operatori aritmetici
			punteggioTotale += punteggioPartita;
			partiteGiocate++;
			double mediaPunteggio = Math.round((double) punteggioTotale / partiteGiocate * 100.0) / 100.0;
			
			System.out.println("Punteggio totale: " + punteggioTotale);
			System.out.println("Media punteggio: " + mediaPunteggio);
			
			//chedere se continuare
			System.out.println("\nVuoi giocare ancora? (1 = Si, 2 = No): ");
			int risposta = scanner.nextInt();
			giocareAncora = (risposta == 1);
		}
		
		//messaggio finale in base al punteggio totale
		System.out.println("\n=== Fine del gioco ===");
		System.out.println("Partite giocate: " + partiteGiocate);
		System.out.println("Punteggio totale: " + punteggioTotale);
		
		if(punteggioTotale >= 300) {
			System.out.println("Titolo: Frate Indovino");
		}else if (punteggioTotale >= 150) {
			System.out.println("Titolo: Buon Giocatore");
		}else {
			System.out.println("Titolo: Scarsone");
		}
		scanner.close();
	}
}
