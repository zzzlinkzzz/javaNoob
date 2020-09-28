import java.util.Scanner;

public class NumberProperty {
	
	public static boolean isPrime(int num) {
		/*
		 * this function check a number is prime number.
		 * return boolean.
		 */
		boolean result = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result = false;
				break;
			} else {
				result = true;
			}
		}
		return result;
	}
	
	
	public static boolean isPallindrome(int num) {
		/*
		 * this function check a number is pallindrome.
		 * return boolean.
		 */
		
		int originN, reverseN = 0,remainN;
		originN = num;
		while (num != 0) {
			remainN = num % 10;
			reverseN = reverseN * 10 + remainN;
			num = (int)(num / 10);
		}
		
		if (originN == reverseN) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isArmstrong(int num) {
		/*
		 * this function check a number is armstrong.
		 * return boolean.
		 */
		
		int originN = num;
		double charLength = Integer.toString(num).length();
		double remainN;
		
		int sum = 0;
		while (num != 0) {
			remainN = num % 10;
			sum += (int)Math.pow(remainN, charLength);
			num = (int)(num / 10);
		}
		
		if (originN == sum) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// put number untill get a right value:
		int n,count,temp;
		System.out.println("Input length of numbers list : ");
		
		do {
			n = scan.nextInt();
			if (n < 0) {
				System.out.println("n can not be negative!");
			} else {
				break;
			}
		} while (true);
		
		scan.close();
		System.out.println();
		
		// print list of n prime numbers:
		count = 0;
		temp = 1;
		
		System.out.println("List of prime numbers:");
		
		while( count <= n) {
			if (isPrime(temp)) {
				count++;
				System.out.printf("%d ", temp);
			}
			temp++;
		}
		System.out.println();
		System.out.println();
		
		// print list of n pallindrome numbers:
		count =0;
		temp = 0;
		
		System.out.println("List of pallindrome numbers:");
		
		while( count <= n) {
			if (isPallindrome(temp)) {
				count++;
				System.out.printf("%d ", temp);
			}
			temp++;
		}
		System.out.println();
		System.out.println();
		
		// print list of n pallindrome & prime numbers:
		count =0;
		temp = 0;
		
		System.out.println("List of pallindrome & prime numbers:");
		
		while( count <= n) {
			if (isPrime(temp)) {
				if (isPallindrome(temp)) {
					count++;
					System.out.printf("%d ", temp);
				}
			}
			temp++;
		}
		System.out.println();
		System.out.println();
		
		// print list of n armstrong numbers:
		count =0;
		temp = 1;
		
		System.out.println("List of armstrong numbers:");
		
		while( count <= n) {
			if (isArmstrong(temp)) {
				count++;
				System.out.printf("%d ", temp);
			}
			temp++;
		}
		System.out.println();
	}
}