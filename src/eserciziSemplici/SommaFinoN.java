package eserciziSemplici;
import java.util.Scanner;
public class SommaFinoN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi un numero");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
