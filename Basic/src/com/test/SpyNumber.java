package com.test;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbe");
		int num = sc.nextInt();
		int product=1;
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			product=product*digit;
			sum=sum+digit;
			num=num/10;
			
		}
		if(product==sum)
		{
			System.out.println("is spy number");
		}
		else
		{
			System.out.println("is not spy number");
		}

	}

}
