package array;

public class NumeroMassimo {
	public static void main(String[] args) {
		
		int[] numeri = {10, 4, 50};
		int massimo = numeri[0];
		
		for(int i = 1; i < numeri.length; i++) {
			if(numeri[i] > massimo) {
				massimo = numeri[i];
			}
		}
		System.out.println(massimo);
	}
}
