package esercizio;//DA RIVEDERE
import java.util.Scanner;
public class FattorialeNumero {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int numero = scanner.nextInt();
		
		long fattoriale = 1;
		for (int i = 1; i <= numero; i++) {
			fattoriale *= i;
		}
		System.out.println(numero + "! = " + fattoriale);
		scanner.close();
		
	}
}
