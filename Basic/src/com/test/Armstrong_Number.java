package com.test;
import java.util.*;
class Aramstrong
{
	public static void number()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int add = 0;
		while(num>0)
		{
			int digit=num%10;
			//add=digit+digit+digit;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not Armstrong");
		}
	}
}
public class Armstrong_Number {
	static void number()
	{
		//Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
		//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
//		int sum=0;
//		int temp;
//		for(int i=1;i<=500;i++)
//			
//		{     temp=i;
//			for(int j=i;j<=i;j++)
//			{
//			
//			int digit=i%10;
//			sum=sum+(digit*digit*digit);
//			i=i/10;
//			
//			if(sum==temp)
//			{
//				System.out.println("is armstrong"+temp);
//			}
//			
//		}
//			temp++;
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aramstrong.number();
		System.out.println("======================================================");
		Armstrong_Number.number();

	}

}
