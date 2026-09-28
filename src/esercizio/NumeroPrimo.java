package esercizio; // DA RIVEDERE
import java.util.Scanner;
public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Scrivi un numero");
		int n = scanner.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " è un numero primo");
		}else {
			System.out.println(n + " non è un numero primo");
		}
		scanner.close();
	}
}
