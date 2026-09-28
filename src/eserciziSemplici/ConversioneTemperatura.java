package eserciziSemplici;
import java.util.Scanner;
public class ConversioneTemperatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Conversione da Celsius a Fahreneit e viceversa");
		int celsius = scanner.nextInt();
		int fahreneit = celsius * 9/5 + 32;
		
		System.out.println(fahreneit);
		
		
		
	}
}
