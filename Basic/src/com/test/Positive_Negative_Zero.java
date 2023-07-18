package com.test;
import java.util.Scanner;
public class Positive_Negative_Zero {
	static void count()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		char choice;
		int pcount=0;
		int ncount=0;
		int zcount=0;
		do
		{
			System.out.println("Enter number");
			 num = sc.nextInt();
			if(num>0)
			{
				pcount++;
			}
			else if(num<0)
			{
				ncount++;
			}
			else
			{
				zcount++;
			}
			System.out.println("Do you want to continue y/n?");
			System.out.println("Enter choice");
			choice=sc.next().charAt(0);
			
		}while(choice=='y'||choice=='Y');
		System.out.println(pcount);
		System.out.println(ncount);
		System.out.println(zcount);
	}

	public static void main(String[] args) {
		// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
		Positive_Negative_Zero .count();

	}

}
