package com.test;
import java.util.*;
public class Harshad_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		int mul=1;
		while(num>0)
		{
			int digit=num%10;
			sum+=digit;
			mul=mul*digit;
			num/=10;
		}
		if(sum==mul)
		{
			System.out.println("is harshad");
		}
		else
		{
			System.out.println("is not harshad");
		}

	}

}
