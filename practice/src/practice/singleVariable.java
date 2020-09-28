package practice;

import java.util.ArrayList;
import java.util.Scanner;


public class singleVariable {
	
	// tinh sum cac gia tri trong arraylist:
	public static double sumArrls(ArrayList<Double> arrls) 
	{
		double sumArr = 0;
		
		for (int i = 0; i< arrls.size(); i++) {
			sumArr += arrls.get(i);
		}
		return sumArr;
	}
	
	//in cac gia tri trong arraylist:
	public static void print(ArrayList<Double> arrls) 
	{
		for (int i = 0; i< arrls.size();i++)
		{
			System.out.print(arrls.get(i) + " ");
		}
		System.out.println();
	}
	
	//day khai trien e^x
	public static ArrayList<Double> exp(int n, int x)
	{
		ArrayList<Double> expArr = new ArrayList<>();
		double tempE = 1;
		expArr.add(tempE);
		
		for (int i = 1; i < n; i++)
		{
			tempE *= x/i;
			expArr.add(tempE);
		}
		return expArr;
	}
	
	//day khai trien sin
	public static ArrayList<Double> sin(int n, int x)
	{
		ArrayList<Double> sinArr = new ArrayList<>();
		double tempS = 1;
		
		for (int i = 1; i < n; i++)
		{
			tempS *= x/i;
			
			if (i%2 == 1) 
			{
				if ((i/2)%2 == 0)
				{
					sinArr.add(tempS);
				}
				else
				{
					sinArr.add(-tempS);
				}
			}
		}
		return sinArr;
	}
	
	//day khai trien cos:
	public static ArrayList<Double> cos(int n, int x)
	{
		ArrayList<Double> cosArr = new ArrayList<>();
		double tempC = 1;
		cosArr.add(tempC);
		
		for (int i = 1; i < n; i++)
		{
			tempC *= x/i;
			
			if (i%2 == 0)
			{
				if ((i/2)%2 == 0)
				{
					cosArr.add(tempC);
				}
				else
				{
					cosArr.add(-tempC);
				}
			}
		}
		
		return cosArr;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("nhap gia tri n");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("nhap gia tri x");
		int x = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		System.out.println("chuoi exp:");
		print(exp(n,x));
		System.out.println("chuoi sin:");
		print(sin(n,x));
		System.out.println("chuoi cos:");
		print(cos(n,x));
	}
}
