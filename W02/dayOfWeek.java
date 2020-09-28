import java.util.Scanner;

public class dayOfWeek {
	public static int dayofweek (String[] ymd) {
		
		int y = Integer.parseInt( ymd[0] );
		int m = Integer.parseInt( ymd[1] );
		int d = Integer.parseInt( ymd[2] );
		
		int y0 = y - (int)((14 - m) / 12);
		int x = y0 +(int)(y0 / 4) - (int)(y0 / 100) +(int)(y0 / 400);
		
		int m0 = m + 12 * (int)((14 - m) / 12) -2;
		
		int d0 = (d + x + 31* m0 / 12) % 7;
		
		return d0;
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input datetime (YYYY-MM-DD): ");
		String[] ymd = scan.nextLine().split("-");
		
		System.out.println("Day of Week: " + dayofweek(ymd));
	}
}