package array;

public class InvertireArray {
	public static void main(String[] args) {
		
		int[] array = {10, 20, 30};
		int[] invertito = invertiArray(array);
		
		System.out.println("Originale: " + java.util.Arrays.toString(array));
		System.out.println("Invertito: " + java.util.Arrays.toString(invertito));
	}
	
	public static int[] invertiArray(int[] array) {
		int n = array.length;
		int[] nuovoArray = new int[n];
		
		for(int i = 0; i < n; i++) {
			nuovoArray[i] = array[n - 1 - i];
		}
		
		return nuovoArray;
	}
}
