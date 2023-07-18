package com.test;
import java.util.Scanner;
public class Power_Base {
	static void power()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter power");
		int power=sc.nextInt();
		int result=1;
		for(int i=1;i<=power;i++)
		{
			result=result*base;
		}
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
		Power_Base.power();

	}

}
