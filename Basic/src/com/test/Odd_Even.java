package com.test;
import java.util.Scanner;
public class Odd_Even {
	static void even()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		char choice;
		int evennum=0;
		int oddnum=0;
		do
		{
			System.out.println("Enter number");
			 num=sc.nextInt();
			 if(num%2==0)
			 {
				 evennum=evennum+num;
			 }
			 else
			 {
				 oddnum=oddnum+num;
			 }
			 System.out.println("Do you want to continue y/n?");
			 choice = sc.next().charAt(0);
		}while(choice=='Y'||choice=='y');
		System.out.println("Even number"+":"+evennum);
		System.out.println("Odd Number"+":"+oddnum);
	}

	public static void main(String[] args) {
		// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
		Odd_Even.even();

	}

}
