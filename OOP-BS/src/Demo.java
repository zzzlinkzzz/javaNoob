import java.util.Scanner;

public class Demo {
	
	// Nhập vào một số n (đối dòng lệnh - nhập vào từ bàn phím)
	// Tính tổng các số từ 1 - n
	// Tạo ra một biến lưu tổng: sum = 0
	// sum = 1 + 2 + 3 + ... + n
	// KHởi tạo sum = 0
	// sum = 0
	// sum = sum + 1
	// sum = sum + 2
	// ..
	// sum = sum + n
	// in ra kết quả
	
	
	public static void main(String[] args) {
		// Nhập vào từ bàn phím
		Scanner scan = new Scanner(System.in);
		
		// Khai báo biến n, nhập vào từ bàn phím, sử dụng biến scan
		int n = scan.nextInt();
	//	int m = scan.nextInt();
		System.out.println(" n = " + n);
		
		// for, while
		int sum = 0;
		
		// for( khởi tạo; điều kiện tiếp tục vòng lặp; thay đổi biến)
//		for( int i = 0; ; i ++)
//			sum = sum + i;
//		System.out.println("Tổng các số là từ 1 đến " + n + " là: " + sum );
			
		// while(condition)
		// {}
		int i =0;
		while (i<= n)
		{
			sum = sum + i;
			i++;
		}
		
		System.out.println("Tổng các số là từ 1 đến " + n + " là: " + sum );
		
		
		// do{} while();
		
		// n = 10000
		// x = 30
		// x^n /n! = 30^10000 / 10000! --> Không làm cách này vì bị tràn số
		// temp = 1
		// sum = 1
		// vòng lặp i : 1 - n
		// i = 1: temp = temp *x /i = 1 * x / 1 = x
		// sum = sum + temp = 1 + x
		// i = 2: temp = temp * x / i = x * x / 2 = x^2/2!
		// sum = sum + temp = 1 + x + x^2/2!
		// i = 3: temp = temp * x / i = x^2/2! * x/i = x^3/3!
		// sum = sum + temp = 1 + x + x^2/2! + x^3/3!
		//... i = n
	}

}
