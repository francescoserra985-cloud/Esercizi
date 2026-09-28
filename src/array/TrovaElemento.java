package array;
import java.util.Scanner;
public class TrovaElemento {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi un numero");
		
		boolean trovato = false;
		int numero = scanner.nextInt();
		int numeri[] = {10, 20, 30, 40};
		
		
		for(int elemento : numeri) {
			if(elemento == numero) {
				trovato = true;
				break;
			}
		
		}
		
		if(trovato) {
			System.out.println("trovato");
		}else {
			System.out.println("non trovato");
		}
		
		scanner.close();
		}
		
	}

