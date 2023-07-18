package com.test;
import java.util.*;
public class PrimeNumber {
	public static void prime()
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=2;i<20;i++)
		{
			
			boolean isprime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				isprime=false;
				}
			}
			if(isprime==true)
			{
				count++;
				sum=sum+i;
				System.out.println(i);
			}
		}System.out.println(count);
		System.out.println(sum);
		double avg=(double)sum/count;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber.prime();

	}

}
