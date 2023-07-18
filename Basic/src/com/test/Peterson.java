package com.test;
import java.util.*;
public class Peterson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		
		int temp=num;
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
		if(sum==temp)
		{
			System.out.println("Peterson");
		}
		else
		{
			System.out.println("is not peterson");
		}

	}

}
