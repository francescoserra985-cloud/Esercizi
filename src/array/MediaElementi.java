package array;

public class MediaElementi {
	public static void main(String[] args) {
		
		int[] numeri = {2, 4, 6, 8};
		
		int somma = 0;
		for(int numero : numeri) {
			somma += numero;
		}
		System.out.println(somma / 4);
	}
}
