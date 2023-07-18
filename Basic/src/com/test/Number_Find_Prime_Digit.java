package com.test;
import java.util.Scanner;
public class Number_Find_Prime_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int digit;
		while(num>0)
		{
			 digit=num%10;
			 //temp=digit;
			 num/=10;
			if(digit==2||digit==3||digit==5||digit==7)
			{
				System.out.println("is prime:"+digit);
			}

	}

}

}
