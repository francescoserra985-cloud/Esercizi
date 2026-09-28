package esercizio; // DA RIVEDERE
import java.util.Scanner;
public class InizialeNome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci nome e cognome: ");
		String input = scanner.nextLine().trim();
		
		String[] parti = input.split("\\s+");
		
		StringBuilder iniziali = new StringBuilder();
		for(String parola : parti) {
			if(!parola.isEmpty()) {
				iniziali.append(Character.toUpperCase(parola.charAt(0))).append(".");
			}
		}
		System.out.println("Iniziali " + iniziali);
		
		scanner.close();
		
		
	}
}
