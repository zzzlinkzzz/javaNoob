import java.util.Scanner;

public class Exp {
	public static double exp (double x, double n) {		
		double e = 1;
		double temp = 1;
		
		if (n >= 1) {
			for (int i = 1; i <= n; i++) {
				temp *= x / i;
				e += temp;
			}
		}
		return e;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// nhap gia tri cua x:
		System.out.println("Input int x value");
		int x = scan.nextInt();
		
		// nhap gia tri cua n:
		int n;
		do {
			System.out.println("Input n value");
			n= scan.nextInt();
			
			if (n < 0) {
				System.out.println("n must not be a negative integer!");
				}
			} while ( n < 0);
		
		scan.close();
		
		//ket qua:
		System.out.println("e ^ x = " + exp(x,n));
	}
}