package com.interview;
import java.util.*;
public class Interview1 {
	public static void perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=i+sum;
			}
		}
		if(sum==num)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("is not");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		Interview1.perfect(num);
	

	}

}
