package esercizio;

public class ArraySemplice {
	public static void main(String[] args) {
		
		//creazione array 5 numeri interi
		int[] numeri = {10, 20, 30, 40, 50};
		
		//stampali tutti
		System.out.println("Numeri nell'Array:");
		for(int i = 0; i < numeri.length; i++) {
			System.out.println("numeri[" + i + "] =" + numeri[i]);
		}
		
		//calcolo somma
		int somma = 0;
		for (int numero : numeri) {
			somma += numero;
		}
		
		//stampa della somma
		System.out.println("La somma dei numeri è: " + somma);
		
	}
}
