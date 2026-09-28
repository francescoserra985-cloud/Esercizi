package esercizio;
import java.util.Scanner;
public class LunghezzaParola {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi una parola e ti dico quante lettere contiene");
		String parola = scanner.nextLine();
		
		
		System.out.println("La parola " + parola + " contiene " + parola.length() + " caratteri");
		
		scanner.close();
		
	}	
}
