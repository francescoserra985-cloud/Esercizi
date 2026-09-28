package esercizio;
import java.util.Scanner;
public class PariDispariWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi un numero:");
		int n = scanner.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " è pari");
		}else {
			System.out.println(n + " è dispari");
		}
		
		while(n > 0) {
			System.out.println(n);
			n--;
		}
		scanner.close();
	}
}
