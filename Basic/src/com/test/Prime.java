package com.test;
import java.util.Scanner;
public class Prime {
	static void number()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		boolean isprime=true;
		for(int i=2;i<num;i++)
		{
			
			if(num%i==0)
			{
				isprime=false;
			}
			
		}
		if(isprime&&num>1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("is not prime");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime.number();

	}

}
