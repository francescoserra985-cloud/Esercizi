package eserciziSemplici;

public class NumeroGrande {
	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		int c = 32;
		
		int massimo = a;
		if(b > massimo) {
			massimo = b;
		}
		if(c > massimo) {
			massimo = c;
		}
		System.out.println("Il numero più grande è: " + massimo);
	}
}
