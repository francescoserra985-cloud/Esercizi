package esercizio;
import java.util.Scanner;
public class CalcolatriceSemplice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("=== Calcolatrice ===");
		
		System.out.println("Digitare il primo numero:");
		int a = scanner.nextInt();
		System.out.println("Digitare il secondo numero:");
		int b = scanner.nextInt();
		
		System.out.println("Inserire il simbolo per l'operazione: +, -, *, /");
		char operazione = scanner.next().charAt(0);
		
		int risultato = 0;
		
		switch (operazione) {
		case '+':
			risultato = a + b;
			break;
			
		case '-':
			risultato = a - b;
			break;
			
		case '*':
			risultato = a * b;
			break;
			
		case '/':
			risultato = a / b;
			break;
			
			}
		System.out.println("Risultato " + risultato);
		scanner.close();
		

		}
		
		
		}
	
		
	
		
		
		
	

