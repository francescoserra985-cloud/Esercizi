package esercizio;
import java.util.Scanner;
public class RichiestaNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Inserire qualsiasi numero: ");
		scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero +" è pari");
		}else {
			
			System.out.println(numero + " è dispari");
		}
		scanner.close();
		
	}
}
