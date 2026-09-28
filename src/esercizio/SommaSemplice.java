package esercizio;
import java.util.Scanner;
public class SommaSemplice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi 2 numeri da sommare");
		int numero1 = scanner.nextInt();
		
		System.out.println("Scrivi il secondo numero");
		int numero2 = scanner.nextInt();
		
		int risultato = numero1 + numero2;
		System.out.println("Il risultato è: " + risultato);
	}
}
