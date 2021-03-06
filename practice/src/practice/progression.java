package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class progression {
	
	// function input array:
	public static ArrayList<Integer> input(String fileName) {
		ArrayList<Integer> numArr =new ArrayList<>();
		Scanner scan = null;
		int n;
		
		try {
			scan = new Scanner(new File(fileName));
			n = Integer.parseInt(scan.nextLine());
			
			for (int i = 0; i < n; i++) {
				int num = scan.nextInt();
				numArr.add(num);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return numArr;
	}
	
	//function print array:
	public static void print(ArrayList<Integer> numArr){
		for (int s: numArr)
			System.out.print(s + " ");
		System.out.println();
	}
	
	public static int sum(ArrayList<Integer> numArr) {
		int sum = 0;
		for (int i = 0; i < numArr.size();i++) {
			sum += numArr.get(i);
		}
		return sum;
	}
	
	public static int max(ArrayList<Integer> numArr) {
		int max = numArr.get(0);
		for (int i = 1; i < numArr.size();i++) {
			if(max < numArr.get(i)) {
				max = numArr.get(i);
			}
		}
		return max;
	}
	
	public static int min(ArrayList<Integer> numArr) {
		int min = numArr.get(0);
		for (int i = 1; i < numArr.size();i++) {
			if(min > numArr.get(i)) {
				min = numArr.get(i);
			}
		}
		return min;
	}
	
	// tim tat ca cac so nguyen to:
	public static ArrayList<Integer> prime(ArrayList<Integer> numArr){
		ArrayList<Integer> primeArr = new ArrayList<>();
		
		for (int i = 0; i< numArr.size();i++) {
			int num = numArr.get(i);
			boolean check = true;
			
			for(int j = 2;j < num;j++) {
				if (num % j == 0) {
					check = false;
				}
			}
			
			if (check == true) {
				primeArr.add(num);
			}
		}
		return primeArr;
	}
	
	//tim tat ca cac so chinh phuong
	public static ArrayList<Integer> soCP(ArrayList<Integer> numArr){
		ArrayList<Integer> soCPArr = new ArrayList<>();
		
		for (int i = 0; i< numArr.size();i++) {
			int num = numArr.get(i);
			if ((num == 0)|(num == 1)) {
				soCPArr.add(num);
				continue;
			}
			for (int j = 0; j < num;j++) {
				if (Math.pow(j,2)==num) {
					soCPArr.add(num);
					break;
				}
			}
		}
		return soCPArr;
	}
	
	//tim tat ca cac so hoan hao
	public static ArrayList<Integer> soHH(ArrayList<Integer> numArr){
		ArrayList<Integer> soHHArr = new ArrayList<>();
		
		for (int i = 0; i< numArr.size();i++) {
			int num = numArr.get(i);
			int sum = 1;
			for (int j = 2; j < num;j++) {
				if (num%j == 0) {
					sum += j;
				}
			}
			
			if (num == sum) {
				soHHArr.add((num));
			}
		}
		return soHHArr;
	}
	
	
	//function kiem tra cap so cong:
	public static boolean checkAritProg(ArrayList<Integer> numArr){
		int len =  numArr.size();
		for (int i = 0; i < len; i++) {
			if (i+2 == len) {
				break;
			}
			if ((numArr.get(i+2) - numArr.get(i+1)) != (numArr.get(i+1)-numArr.get(i))){
				return false;
			}
		}
		return true;
	}
	
	//function kiem tra cap so nhan:
	public static boolean checkGeoProg(ArrayList<Integer> numArr){
		int len =  numArr.size();
		for (int i = 0; i < len; i++) {
			if (i+2 == len) {
				break;
			}
			if ((numArr.get(i+2) / numArr.get(i+1)) != (numArr.get(i+1) / numArr.get(i))){
				return false;
			}
		}
		return true;
	}
	
	//function kiem tra day dan dau:
	public static boolean checkLeibniz(ArrayList<Integer> numArr){
		
		int i = 0;
		boolean check = true;
		
		do {
			if (i+1 == numArr.size()) {
				break;
			}
			check = numArr.get(i)*numArr.get(i+1) < 0;
			i++;
		} while (check);
		return check;
	}
	
	//function kiem tra day tang:
	public static boolean checkAscArr(ArrayList<Integer> numArr){

		int i = 0;
		boolean check = true;
		
		do {
			if (i+1 == numArr.size()) {
				break;
			}
			check = numArr.get(i) < numArr.get(i+1);
			i++;
		} while (check);
		
		return check;
	}
	
	
	
	//function kiem tra day doi xung:
	public static boolean checkSymm(ArrayList<Integer> numArr) {
		/*
		 * gia tri check ban dau = true
		 * kiem tra tu 0 - phan nguyen cua n/2:
		 * neu gia x[i] <> x[n-i] => check = false then break
		 * 
		 * return check
		 */
		boolean check = true;
		int n = numArr.size();
		
		for (int i = 0; i <= (int)(n/2);i++ ) {
			if (numArr.get(i) != numArr.get(n-i-1)) {
				check = false;
				break;
			}
		}
		return check;
	}
	
	public static void main(String[] args){
		Scanner inputFilename = new Scanner(System.in);
		System.out.println("nhap ten file: ");
		String fileName = inputFilename.nextLine() + ".txt";
		inputFilename.close();
		
		ArrayList<Integer> numArr = input(fileName);
		
		System.out.println("day so vua nhap:");
		print(numArr);
		
		System.out.println("Tong: "+sum(numArr));
		System.out.println("Trung binh: "+sum(numArr)/numArr.size());
		System.out.println("Max: "+max(numArr));
		System.out.println("Min: "+min(numArr));
		
		System.out.println("Cac so nguyen to:");
		print(prime(numArr));
		
		System.out.println("Cac so chinh phuong:");
		print(soCP(numArr));
		
		System.out.println("Cac so hoan hao:");
		print(soHH(numArr));
		
		
		System.out.println("kiem tra tinh chat cap so cong:");
		if (checkAritProg(numArr)) {
			System.out.println("day so la cap so cong!");
		} else {
			System.out.println("khong phai cap so cong!");
		}
		System.out.println();
		
		System.out.println("kiem tra tinh chat cap so nhan:");
		if (checkGeoProg(numArr)) {
			System.out.println("day so la cap so nhan!");
		} else {
			System.out.println("khong phai cap so nhan!");
		}
		System.out.println();
		
		System.out.println("kiem tra day tang:");
		if (checkAscArr(numArr)) {
			System.out.println("day so la day tang!");
		} else {
			System.out.println("khong phai day tang!");
		}
		System.out.println();
		
		System.out.println("kiem tra day dan dau:");
		if (checkLeibniz(numArr)) {
			System.out.println("day so la day dan dau!");
		} else {
			System.out.println("khong phai day dan dau!");
		}
		System.out.println();
		
		System.out.println("kiem tra day doi xung:");
		if (checkSymm(numArr)) {
			System.out.println("day so la day doi xung!");
		} else {
			System.out.println("khong phai day doi xung!");
		}
		System.out.println();

	}
}
