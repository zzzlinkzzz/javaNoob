import java.util.Scanner;

class array {
	public static int[] input(Scanner scan) {
		System.out.println("nhap vao n: ");
		int n = Integer.parseInt(scan.nextLine());
		
		int a[] = new int[n];
		
		System.out.println("nhap cac phan tu cua mang: ");
		for (int i = 0; i < n;i++) {
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("mang vua nhap la: ");
		for (i = 0;i<n;i++) {
			System.out.print(a[i] + "/t");
		}
	}
}