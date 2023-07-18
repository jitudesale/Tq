package com.interviewprogram;
import java.util.Scanner;
public class Sum_Prime_Number {
	static void sum(int num,int sum)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			boolean isprime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
				}
			}
			if(isprime)
			{
				count++;
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println(sum+" "+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		Sum_Prime_Number.sum(num, sum);

	}

}
