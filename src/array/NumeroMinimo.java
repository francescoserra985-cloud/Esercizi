package array;

public class NumeroMinimo {
	public static void main(String[] args) {
		
		int[] numeri = {50, 45, 10};
		int minimo = numeri[0];
		
		for(int i = 1; i < numeri.length; i++) {
			if(numeri[i] < minimo) {
				minimo = numeri[i];
			}
		}
		System.out.println(minimo);
	}
}
