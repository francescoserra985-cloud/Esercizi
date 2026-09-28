package esercizio;
import java.util.Scanner;
public class ContoAllaRovescia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Conto alla rovescia");
		int numero = scanner.nextInt();
		
		for(int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
		scanner.close();
		
	}
}
