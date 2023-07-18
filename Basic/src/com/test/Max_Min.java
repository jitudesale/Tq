package com.test;
import java.util.Scanner;
public class Max_Min {
	static void max_min()
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		int max=Integer.MIN_VALUE;
				
		int min=Integer.MAX_VALUE;
		char choice;
		do
		{
			System.out.println("Enter the number");
			num=sc.nextInt();
			if(num>max)
			{
				max=num;
			}
			else if(num<min)
			{
				min=num;
			}
			System.out.println("Do you want to continue y/n?");
			System.out.println("Enter choice");
			 choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');
		System.out.println("max number:"+max);
		System.out.println("min number:"+min);
	}

	public static void main(String[] args) {
		// Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
		Max_Min.max_min();

	}

}
