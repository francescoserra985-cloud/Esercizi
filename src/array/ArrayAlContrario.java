package array;

public class ArrayAlContrario {
	public static void main(String[] args) {
		
		int[] numeri = {10, 20, 30, 40};
		
		for(int i = numeri.length - 1; i >= 0; i--) {
			System.out.println(numeri[i]);
		}
	}
}
