package array;

public class SommaElementi {
	public static void main(String[] args) {
		
		int[] numeri = {10, 20, 30, 40};
		
		int somma = 0;
		for(int numero : numeri) {
			somma += numero;
		}
		System.out.println(somma);
	}
}
