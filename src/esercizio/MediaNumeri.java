package esercizio;
import java.util.Scanner;
public class MediaNumeri {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi il primo numero");
		int a = scanner.nextInt();
		
		System.out.println("Scrivi il secondo numero");
		int b = scanner.nextInt();
		
		System.out.println("Scrivi il terzo numero");
		int c = scanner.nextInt();
		
		
		int media = (a+b+c) / 3;
		
		System.out.println("La media dei seguenti numeri è: " + media);
		scanner.close();
		
		
	}
}
