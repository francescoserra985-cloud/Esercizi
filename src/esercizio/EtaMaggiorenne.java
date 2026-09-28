package esercizio;
import java.util.Scanner;
public class EtaMaggiorenne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un età per vedere se è maggiorenne");
		int eta = scanner.nextInt();
		
		if(eta >= 18) {
			System.out.println("Sei maggiorenne");
		}else {
			System.out.println("Sei minorenne");
		}
			scanner.close();
		
	}
}
