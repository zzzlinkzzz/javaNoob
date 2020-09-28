import java.util.Scanner;

public class Number {
	// Bài tập về nhà:
	/*
	 * 1. Kiểm tra tính chất số: số nguyên tố, chính phương, đối xứng
	 * 2. Bài tập tính e^x, sinx, cosx (Bài 3-4 tuần 02).
	 *	Tự học phần mảng 1 chiều và mảng 2 chiều. (Làm tiếp bài tập tuần 5-6)
	 */
	
	// Tính chất số:
	// Số nguyên tố: > 0, và chia hết cho 1 và chính nó: 2 3 5 7 11
	// Số chính phương: Bình phương của 1 số: 1 4 9 16 25 
	// Số hoàn hảo: > 0; và = tổng các ước dương nhỏ hơn nó: 6 28 496 
		// 6 = 1 + 2 + 3; 28 = 1 + 2 + 4  + 7 + 14
	// Amstrong: abc = a^3 + b^3 + c^3; abcd = a^4 + b^4 + c^4 + d^4; ....
	// Palinedrome: số đối xứng: 121, 1331, 14541; ...
	
	// Nhập vào 1 số từ bàn phím, kiểm tra xem đây có phải là số hoàn hảo hay không?
	
	// Tính tổng các ước dương nhỏ hơn n, so sánh với n, và đưa ra kết luận? 
	public static boolean checkPerfect(int n)
	{
		if(n <= 0)
			return false;
		int sum = 0;
		for (int i = 1; i < n; i++)
			if(n % i == 0)
				sum += i; // sum = sum + i;
		if(sum == n)
			return true;
		else
			return false;
	}
	
	// Hàm kiểm tra số n có phải là số nguyên tố hay không?
	public static boolean checkPrimeNumber(int n)
	{
		return true;
	}

	// Nhập vào số n từ bàn phím
	// In ra kết quả
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// cách 1
		boolean result = checkPerfect(n);
		System.out.println(result);
		
		// cách 2: Gọi trực tiếp
		System.out.println(checkPerfect(n));
	}
}
