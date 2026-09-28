package esercizio;
import java.util.Scanner;
public class ConversioneFahreneit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi una temperatura (Celsius)");
		
		int celsius = scanner.nextInt();
		int fahreneit = celsius * 9/5 + 32; 
		
		System.out.println("Temaperatura in Fahreneit " + fahreneit);
		
	}
}
