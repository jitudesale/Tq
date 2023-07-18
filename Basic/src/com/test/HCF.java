package com.test;
import java.util.Scanner;
public class HCF {
	static void number()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divident");
		int divident=sc.nextInt();
		System.out.println("Enter divisor");
		int divisor=sc.nextInt();
		int reminder,hcf=0;
		do
		{
			reminder=divident/divisor;
			if(reminder==0)
			{
				hcf=divisor;
			}
			else
			{
				divident=divisor;
				divisor=reminder;
			}
		}while(reminder!=0);
			System.out.println("is HCF:"+hcf);
		
	}

	public static void main(String[] args) {
		// Write a program to calculate HCF of Two given number.
		HCF.number();

	}

}
