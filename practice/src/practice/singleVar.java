package practice;

import java.util.Scanner;

public class singleVar {
	//e^x:
	public static float exp(int x, int n) 
	{
		float expVar = 1;
		float tempE = 1;
		
		for (int i = 1; i < n; i++)
		{
			tempE *= x/i;
			expVar += tempE;
		}
		return expVar;
	}
	
	//tinh sin:
	public static float sin(int x, int n) 
	{
		float sinVar = 0;
		float tempS = 1;
		
		for (int i = 1; i < n; i++)
		{
			tempS *= x/i;
			
			if (i%2 == 1)
			{
				if ((i/2)%2==0)
				{
					sinVar += tempS;
				}
				else
				{
					sinVar -= tempS;
				}
			}
		}
		return sinVar;
	}
	
	public static float cos(int x, int n)
	{
		float cosVar = 1;
		float tempC = 1;
		
		for (int i = 1; i < n; i++)
		{
			tempC *= x/i;
			
			if (i%2 == 0) {
				if ((i/2)%2 == 0)
				{
					cosVar += tempC;
				}
				else
				{
					cosVar -= tempC;
				}
			}
		}
		
		return cosVar;
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("nhap gia tri x:");
		int x = scan.nextInt();
		System.out.println();
		
		System.out.println("nhap gia tri n:");
		int n = scan.nextInt();
		System.out.println();
		
		scan.close();
		
		System.out.println("gia tri e^x");
		System.out.println(exp(x,n));
		
		System.out.println("gia tri sin(x):");
		System.out.println(sin(x,n));
		
		System.out.println("gia tri cos(x)");
		System.out.println(cos(x,n));
	}

}
