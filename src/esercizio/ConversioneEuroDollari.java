package esercizio;
import java.util.Scanner;
public class ConversioneEuroDollari {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Convertitore EURO - DOLLARI");
		System.out.println("Scrivi un importo (in euro): ");
		
		double importo = scanner.nextDouble();
		double tasso = 1.08;
		
		
		System.out.println(importo * tasso);
	}
}
