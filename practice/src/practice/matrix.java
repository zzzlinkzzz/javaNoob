package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class matrix {
	//input matrix:
	public static int[][] input(String fileName){
		int[][] matrix = null;
		try {
			Scanner scan = new Scanner(new File(fileName));
			int r = Integer.parseInt(scan.nextLine());
			int c = Integer.parseInt(scan.nextLine());
			
			matrix = new int[r][c];
			for (int i=0; i<r; i++) {
				for (int j=0;j<c;j++) {
					matrix[i][j] = scan.nextInt();
				}
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return matrix;
	}
	
	//print cac phan tu cua ma tran:
	public static void printM(int[][] matrix) {
		for (int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printA(int[] arr) {
		for (int i = 0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] sumRow(int[][] arr) {
		int[] sumR = new int[arr.length];
		
		for (int i = 0; i<arr.length;i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length;j++) {
				sum += arr[i][j];
			}
			sumR[i] = sum;
		}
		return sumR;
	}
	
	public static int[] sumCol(int[][] arr) {
		int[] sumC = new int[arr[0].length];
		
		for (int j = 0; j < arr[0].length;j++) {
			int sum = 0;
			for (int i = 0; i < arr.length;i++) {
				sum += arr[i][j];
			}
			sumC[j] = sum;
		}
		return sumC;
	}
	
	public static int sumRowK(int[][] arr,int k) {
		int sum = 0;
		
		for (int j = 0;j< arr[k].length;j++) {
			sum += arr[k][j];
		}
		return sum;
	}
	
	public static int sumColK(int[][] arr, int k) {
		int sum = 0;
		
		for (int i = 0;i < arr.length;i++) {
			sum += arr[i][k];
		}
		return sum;
	}
	
	public static int maxRowK(int[][] arr, int k) {
		int max = arr[k][0];
		for (int j = 1; j < arr[k].length;j++) {
			if (max < arr[k][j]) {
				max = arr[k][j];
			}
		}
		return max;
	}
	
	public static int minRowK(int[][] arr, int k) {
		int min = arr[k][0];
		for (int j = 1; j < arr[k].length;j++) {
			if (min > arr[k][j]) {
				min = arr[k][j];
			}
		}
		return min;
	}

	public static int maxColK(int[][] arr, int k) {
		int max = arr[0][k];
		for (int i = 1; i < arr.length;i++) {
			if (max < arr[i][k]) {
				max = arr[i][k];
			}
		}
		return max;
	}
	
	public static int minColK(int[][] arr, int k) {
		int min = arr[0][k];
		for (int i = 1; i < arr.length;i++) {
			if (min > arr[i][k]) {
				min = arr[i][k];
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String fileName = scan.nextLine()+".txt";
		scan.close();
		int[][] matrix = input(fileName);
		
		System.out.println("ma tran vua nhap:");
		printM(matrix);
		
		System.out.println("Tong cac hang");
		printA(sumRow(matrix));
		
		System.out.println("Tong cac cot");
		printA(sumCol(matrix));
		
		System.out.println("Tong cot 3:");
		System.out.println(sumColK(matrix, 2));
		
		System.out.println("Tong hang 4:");
		System.out.println(sumRowK(matrix, 3));
		
		System.out.println("max cot 3:");
		System.out.println(maxColK(matrix, 2));
		
		System.out.println("min cot 2:");
		System.out.println(minColK(matrix, 1));
		
		System.out.println("max hang 1:");
		System.out.println(maxRowK(matrix, 0));
		
		System.out.println("min hang 4:");
		System.out.println(minRowK(matrix, 3));
	
	}
}
