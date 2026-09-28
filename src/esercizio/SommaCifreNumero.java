package esercizio;
import java.util.Scanner; //DA RIVEDERE
public class SommaCifreNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi un numero");
		int numero = scanner.nextInt();
		
		int n = Math.abs(numero);
		int somma = 0;
		
		while(n > 0) {
			somma += n % 10;
			n /= 10;
		}
		System.out.println("La somma delle cifre di " + numero + " è: " + somma);
		scanner.close();
		
	}
}
