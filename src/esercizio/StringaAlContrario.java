package esercizio;
import java.util.Scanner; // DA RIVEDERE
public class StringaAlContrario {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Scrivi una parola");
		String parola = scanner.nextLine();
		
		String invertita = new StringBuilder(parola).reverse().toString();
		
		System.out.println("Parola al contrario: " + invertita);
		scanner.close();
	}
}
