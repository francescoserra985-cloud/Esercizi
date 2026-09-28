package eserciziSemplici;
import java.util.Scanner;
public class ParioDispari {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		int a = scanner.nextInt();
		
		
		if(a % 2 == 0) {
			System.out.println("il numero è pari");
		}else {
			System.out.println("il numero è dispari");
		}
		scanner.close();
	}
}