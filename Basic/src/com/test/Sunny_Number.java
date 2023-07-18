package com.test;
import java.util.Scanner;
public class Sunny_Number {

	public static void main(String[] args) {
		// TO find number is sunny or not;i.e;num=3 num=num+1; is perfect square number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		num=num+1;
		for(int i=0;i<num;i++)
		{
			if(i*i==num)
			{
				System.out.println("is sunny number");
				break;
			}
			else if(i*i>num)
			{
				System.out.println("is not sunny");
				break;
			}
		}

	}

}
