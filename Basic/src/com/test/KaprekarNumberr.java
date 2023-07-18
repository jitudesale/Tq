package com.test;
import java.util.Scanner;
public class KaprekarNumberr {
	static void number()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		int sqr=num*num;
		int count=0;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			int digit=num/10;
			count++;
			num=num/10;
		}
	
		for(int i=0;i<sqr;i++)
		{
			double pow=Math.pow(10,count);
			int start=(int) (sqr/pow);
			int end=(int)(sqr%pow);
			sum=start+end;

		}
		if(temp==sum)
		{
			System.out.println("is kaprekar");
		}
		else
		{
			System.out.println("is not kaprekar");
		}
	}
	static void withpower()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		int sqr=num*num;
		int count=0;
		int sum=0;
		int temp=num;
		int pow=1;
		while(num>0)
		{
			int digit= num/10;
			count++;
			num=num/10;
		}
		for(int i=1;i<=count;i++)
		{
			pow=pow*10;
		
		}
		for(int i=0;i<=sqr;i++)
		{
			int first=sqr%pow;
			int second=sqr/pow;
			sum=first+second;
		}
		
		if(temp==sum)
		{
			System.out.println("is kaprekar");
		}
		else 
		{
		System.out.println("is not");
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KaprekarNumberr .number();
		KaprekarNumberr.withpower();

	}

}
