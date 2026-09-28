package array;

public class NumeriPari {
	public static void main(String[] args) {
		
		int[] numeri = {10, 20, 55, 40};
		int contatore = 0;
		
		for(int numero : numeri) {
			if(numero % 2 == 0) {
				contatore++;
			}
			
		}
		System.out.println(contatore);
		
		
		
		
		}
	}

