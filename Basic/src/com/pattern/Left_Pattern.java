package com.pattern;
import java.util.Scanner;
public class Left_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
