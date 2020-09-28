import java.util.Scanner;

public class Sin_Cos {
	public static double sin (int x, int n) {
		double SIN = 0;
		double temp = 1;
		
		for (int i = 1; i <= n; i++) {
			temp *= x/i;
			
			if (i % 2 == 1) {
				int testI = i/2;
				
				if ( testI % 2 == 0 ) {
					SIN += temp;
				} else {
					SIN -= temp;
				}
		
			}
		}
		return SIN;
	}
	
	public static double cos (int x, int n) {
		double COS = 1;
		double temp = 1;
		
		for (int i = 1; i <= n; i++) {
			temp *= x/i;
			if (i%2 == 0) {
				int testI = i/2;
				
				if (testI%2 == 0) {
					COS += temp;
				} else {
					COS -= temp;
				}
			}
		}
		return COS;
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input int value of x: ");
		int x = scan.nextInt();
		
		int n;
		do {
			System.out.println("Input int value of n: ");
			n = scan.nextInt();
			
			if (n <= 0) {
				System.out.println("n must be a positive integer!");
			}
			
		} while (n <= 0);
		
		scan.close();
		
		System.out.println("Sin x = " + sin(x,n) );
		System.out.println("Cos x = " + cos(x,n) );
	}
}