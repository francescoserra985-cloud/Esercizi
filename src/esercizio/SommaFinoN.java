package esercizio; 
import java.util.Scanner;
public class SommaFinoN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi un numero e ti calcolo la somma fino a quello.");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("La somma dei numeri è: " + i);
		}
		
		scanner.close();
	}
}
//DA RIVEDERE