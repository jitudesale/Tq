package com.test;
import java.util.Scanner;
public class Neonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sqr=num*num;
		int sum=0;
		while(sqr>0)
		{
			int digit=sqr%10;
			sum=sum+digit;
			sqr=sqr/10;
		}
		if(num==sum)
		{
			System.out.println("is neon");
		}
		else
		{
			System.out.println("is not neon");
		}

	}

}
