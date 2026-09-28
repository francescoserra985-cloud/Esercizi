package esercizio;
import java.util.Scanner;
public class NumeriPositiviNegativi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi un numero e ti dirò se è positivo, negativo o zero.");
		
		int numero = scanner.nextInt();
		
		if(numero > 0) {
			System.out.println("Il numero " + numero + " è positivo");
		}else if(numero < 0) {
			System.out.println("Il numero " + numero + " è negativo");
		}else {
			System.out.println("Numero non valido");
		}
			
		
		
		
	}
}
