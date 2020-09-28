import java.util.Scanner;

public class Matrix {

	/*
	 * 1. Tính chất số
	 * 2. Tính chất của mảng 2 chiều (ma trận): ma trận chéo, ma trận đơn vị, 
	 * ma trận tam giác trên, dưới, ma trận đối xứng
	 * 3. Tính toán trên hàng, cột của ma trận: tính tổng các hàng (cột)
	 * Tìm số lớn nhất trên hàng(cột), ...
	 */
	
	/*
	 * Nhập vào số hàng, cột của ma trận
	 * Nhập vào các phần tử trong ma trận
	 * Trả về ma trận vừa nhập
	 */
	public static int[][] input(Scanner scan)
	{
		int r, c;
		System.out.println("Nhập vào số hàng, số cột: ");
		r = Integer.parseInt(scan.nextLine());
		c = Integer.parseInt(scan.nextLine());
		// Nhập vào các phần tử trong ma trận
		int matrix [][] = new int[r][c];
		System.out.println("Nhập vào các phần tử trong ma trận:");
		for(int i=0; i < r; i++)
			for(int j=0; j < c; j++)
				matrix[i][j] = Integer.parseInt(scan.nextLine());
		return matrix;
	}
	
	public static void printMatrix(int matrix[][])
	{
		System.out.println("Ma trận vừa nhập vào là:");
		for(int i=0; i < matrix.length; i++)
		{
			for(int j=0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	// Tính tổng của hàng thứ 2 (chỉ số là 1) trong ma trận
	public static int computeSumofRow(int matrix[][], int i)
	{
		int sum = 0;
		for(int j = 0; j < matrix[i].length; j++)
			sum += matrix[i][j];
		return sum;
	}
	
	// Tính tổng (riêng) của tất cả các hàng trong ma trận
	public static void computeSumAllRow(int matrix[][])
	{
		for(int i=0; i < matrix.length; i++)
			System.out.println("Tổng của hàng " + i + " là: " + computeSumofRow(matrix, i));
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int matrix[][] = input(scan);
		printMatrix(matrix);
		System.out.println("Tổng của hàng thứ 2 trong ma trận là: " + computeSumofRow(matrix, 1));
		computeSumAllRow(matrix);
	}
}
