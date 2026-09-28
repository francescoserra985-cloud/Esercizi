package esercizio;
import java.util.Scanner;
public class NumeroMassimo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi 2 numeri e ti dirò il più grande.");
		
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Il numero più alto è: " + numero1);
		}else {
			System.out.println("Il numero più alto è: " + numero2);
		}
		
		
		
		scanner.close();
		
		
	}
}
