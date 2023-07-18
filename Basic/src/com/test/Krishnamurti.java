package com.test;
import java.util.Scanner;
public class Krishnamurti {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num;
		
		int sum=0;
		
		while(num>0)
		{ 
			int fact=1;
			int digit=num%10;
			for(int i=1;i<=digit;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("is Krishnamurti");
		}
		else
		{
			System.out.println("is not");
		}

	}

}
