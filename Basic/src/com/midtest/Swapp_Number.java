package com.midtest;
import java.util.Scanner;
public class Swapp_Number {
	static void simple(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("First number is"+"="+a);
		System.out.println("Second number is"+"="+b);
	}
	static void logic(int b,int c)
	{
		b=b+c;
		b=b-c;
		c=c-b;
		System.out.println("first number:"+b);
		System.out.println("Second number:"+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num=sc.nextInt();
		System.out.println("Enter second number");
		int num1=sc.nextInt();
		System.out.println("To Swapp with help of temp");
		Swapp_Number.simple(num,num1);
		System.out.println("To swapp with out help third number");
		Swapp_Number.logic(num, num1);
		

	}

}
