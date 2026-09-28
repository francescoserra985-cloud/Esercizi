package array;

public class Somma2Array {
	public static void main(String[] args) {
		
		int array[] = {2, 4, 6};
		int array2[] = {8, 10, 12};
		int somma[] = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			somma[i] = array[1] + array2[i];
		}
		
		System.out.println("Array 1: ");
		stampaArray(array);
		
		System.out.println("Array 2: ");
		stampaArray(array2);
		
		System.out.println("Somma: ");
		stampaArray(somma);
		
	}
	public static void stampaArray(int[] array) {
		for(int valore : array) {
			System.out.println(valore + " ");
		}
		System.out.println();
	}
}
