package esercizio;
import java.util.Scanner;
public class NumeriPari {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int numero = scanner.nextInt();
		int conteggio = 0;
		
		for(int i = 1; i <= numero; i++) {
			
			if(i % 2 == 0) {
				conteggio++;
				
				}
			}
		
		System.out.println("Ci sono " + conteggio + " numeri pari.");
		scanner.close();
	}
}
