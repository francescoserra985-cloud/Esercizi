package esercizio;
import java.util.Scanner;
public class CalcolatoreSconti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//Variabili
		double prezzoOriginale;
		double prezzoFinale;
		int categoriaCliente;
		boolean continuare = true;
		
		System.out.println("=== Calcolatore Sconti Negozio ===");
		
		//Ciclo WHILE per gestire più acquisti finchè l'utente vuole
		while(continuare) {
			
			System.out.println("\nInserisci il prezzo del prodotto: ");
			prezzoOriginale = scanner.nextInt();
			
			System.out.println("Selezione categoria cliente:");
			System.out.println("1 - Nuovo cliente");
			System.out.println("2 - Cliente abituale");
			System.out.println("3 - Cliente VIP");
			System.out.println("Scelta: ");
			categoriaCliente = scanner.nextInt();
			
			double percentualeSconto;
			
			//SWITCH per determinare lo sconto in base alla categoria
			switch (categoriaCliente) {
			case 1:
				percentualeSconto = 0;
				break;
				
			case 2: 
				percentualeSconto = 10;
				break;
				
			case 3:
				percentualeSconto = 20;
				break;
			default:
				percentualeSconto = 0;
				System.out.println("Categoria non valida, nessuno sconto applicato.");
				break;
				
			}
			
			//operatori aritmetici e classe MATH
			double sconto = prezzoOriginale * (percentualeSconto / 100);
			prezzoFinale = prezzoOriginale - sconto;
			prezzoFinale = Math.round(prezzoFinale * 100.0) / 100.0;
			
			System.out.println("Prezzo originale: " + prezzoOriginale + "€");
			System.out.println("Sconto applicato: " + percentualeSconto + "%");
			System.out.println("Prezzo finale: " + prezzoFinale + "€");
			
			//IF con operatori di comparazione e logici
			if (prezzoFinale > 100 && percentualeSconto >= 10) {
				System.out.println("Hai diritto anche alla spedizione gratuita.");
			}else if (prezzoFinale <= 100 || percentualeSconto == 0) {
				System.out.println("Nessun vantaggio aggiuntivo per questo acquisto.");
			}
			
			//Ciclo FOR per stampare uno scontrino "a rate" simulato
			System.out.println("\nDettaglio ipotetico in 3 rate:");
			double rata = prezzoFinale / 3;
			for (int i = 1; i <= 3; i++) {
				System.out.println("Rata " + i +": " + Math.round(rata * 100.0) / 100.0 + " €");
			}
			
			//chiedere se continuare
			System.out.println("\nVuoi calcolare un altro acquisto? (1 = Si, 0 = No): ");
			int risposta = scanner.nextInt();
			continuare = (risposta == 1); //operatore di comparazione
		}
		
		System.out.println("\nGrazie per aver usato il calcolatore di sconti!");
		scanner.close();
	}
	
}
