import java.util.Scanner;

public class nHelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input int number: ");
		int n = scan.nextInt();
		String s = "Hello, World!";
		
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}
	}
	
}