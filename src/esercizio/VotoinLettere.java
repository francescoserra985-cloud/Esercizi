package esercizio;
import java.util.Scanner;
public class VotoinLettere {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi il voto in numeri (da 0 a 10)");
		int voto = scanner.nextInt();
		
		switch (voto) {
		case 10:
		case 9:
			System.out.println("Valutazione ottima");
			break;
			
		case 8:
			System.out.println("Valutazione distinta");
			break;
			
		case 7:
		case 6:
			System.out.println("Valutazione sufficente");
			break;
		
		default:
			System.out.println("Valutazione insufficente");
			break;
		
		
	
		}
		
		System.out.println(voto);
		scanner.close();
	}
}
