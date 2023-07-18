package com.pattern;
import java.util.Scanner;
public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		int temp=num;
		int sqr=num*num;
		while(num>0)
		{
			int digti=num%10;
			count++;
			num/=10;
		}
		for(int i=0;i<sqr;i++)
		{
			double pow=(int)Math.pow(10, count);
			int first=(int) (sqr/pow);
			int last=(int) (sqr%pow);
			sum=first+last;
		}
		if(temp==sum)
		{
			System.out.println("Is kaprekar");
		}
		else
		{
			System.out.println("is not");
		}

	}

}
