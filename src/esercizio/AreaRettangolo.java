package esercizio;
import java.util.Scanner;
public class AreaRettangolo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi 2 numeri per calcolare l'area di un rettangolo");
		
		System.out.println("Base");
		int base = scanner.nextInt();
		
		System.out.println("Altezza");
		int altezza = scanner.nextInt();
		
		int area = base * altezza;
		System.out.println("L'area del rettangolo è " + area);
	}
}
