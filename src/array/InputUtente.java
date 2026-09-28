package array;
import java.util.Scanner;
public class InputUtente {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		int[] numeri = new int [5];
		
		for(int i = 0; i < numeri.length; i++) {
			System.out.println("Inserisci il numero " + (i + 1) + ": ");
			numeri[i] = scanner.nextInt();
		}
		System.out.println("\nHai inserito i seguenti numeri: ");
		for(int numero : numeri) {
			System.out.println(numero);
		}
		scanner.close();
	}
}
