package com.pattern;
import java.util.Scanner;
public class Number_Even {
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<=num;i++)
		{
			
			int digit=num%10;
			num=num/10;
			if(digit%2==0)
			{
				System.out.println(digit);
				sum=sum+digit;
				count++;
				
			}
			
		}double avg=sum/count;
		System.out.println("Sum:"+sum+" "+avg);
	}

}
