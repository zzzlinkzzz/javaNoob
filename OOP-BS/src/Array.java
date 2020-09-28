import java.util.Scanner;

public class Array {
	/* Tính chất số: Giống buổi trước
	 * Tính chất của mảng 1 chiều: dãy đối xứng, cấp số cộng, cấp số nhân, ...
	 * 
	 * Nhập vào một mảng số nguyên gồm n phần tử
	 * 1. In ra mảng số nguyên đó, mỗi phần tử cách nhau 1 dấu cách
	 * 2. Tính tổng các phần tử trong mảng, in ra tổng
	 * 3. Tìm số lớn nhất/nhỏ nhất của các phần tử trong mảng
	 * 4. Tính và in ra trung bình cộng của các phần tử trong mảng
	 * 5. Kiểm tra xem mảng có phải là dãy tăng hay không? a[i] < a[i+1]
	 * 6. Kiểm tra xem mảng có phải là dãy đối xứng hay không?
	 * 7. Kiểm tra xem mảng vừa nhập có phải là cấp số cộng/nhân hay không?
	 * 8. In ra tất cả các số nguyên tố trong mảng vừa nhập?
	 */
	
	/*
	 * Nhập kích thước của mảng n
	 * Khởi tạo mảng, nhập vào các phần tử của mảng
	 * Trả về mảng vừa nhập
	 */
	
	public static int[] input(Scanner scan)
	{
		// khai báo và nhập n từ bàn phím
		System.out.println("Nhập vào n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		// khai báo mảng với kích thước là n
		int a[] = new int[n];
		
		// Nhập vào từng phần tử của mảng
		System.out.println("Nhập vào các phần tử của mảng: ");
		for(int i=0; i <n; i ++)
			a[i] = Integer.parseInt(scan.nextLine());
		return a;
	}
	
	public static void printArray(int a[])
	{
		// kích thước của mảng: a.length
		System.out.println("Mảng vừa nhập vào là: ");
		for(int i=0; i < a.length; i++)
			System.out.print(a[i] + "\t");
	}
	
	// Tính và trả về tổng các phần tử trong mảng
	public static int computeSum(int a[])
	{
		int sum = 0;
		for(int i =0; i < a.length; i ++)
			sum += a[i];
		return sum;
	}
	
	// Tìm và in ra số lớn nhất và số nhỏ nhất trong mảng
	
	// Kiểm tra dãy tăng
	public static boolean checkIncrease(int a[])
	{
		// a[n-1]
		for(int i=0; i < a.length - 1; i++)
			if(a[i] >= a[i+1])
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = input(scan);
		printArray(array);
		System.out.println("\nTổng các phần tử trong mảng là " + computeSum(array));
		if(checkIncrease(array))
			System.out.println("Dãy tăng");
		else
			System.out.println("Dãy không tăng");
	}

}
