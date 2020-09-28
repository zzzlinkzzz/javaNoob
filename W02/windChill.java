import java.util.Scanner;

public class windChill {
	public static double wc(double t, double v) {
		return (
				35.74 +
				0.625 * t +
				(0.4275 * t - 35.75) * Math.pow(v, 0.16)
				);
	}
	
	public static void  main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double t;
		do {
			System.out.println("Input double t (abs(t) <= 50): ");
			t = scan.nextDouble();
		} while (Math.abs(t) > 50);
		
		double v;
		do {
			System.out.println("Input double v (3 <= v <= 130): ");
			v = scan.nextDouble();
		} while ( (v < 3) || (v > 130) );
		
		double w = wc(t,v);
		
		System.out.println("Wind chill = " + w);
	}
}