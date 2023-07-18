package com.midtest;
import java.util.Scanner;
public class Series_123375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int num1=1;
		int num2=2;
		System.out.print(num1+""+num2);
		for(int i=0;i<=num;i++)
		{
			num1=(2*num1)+1;
			System.out.print(num1+"");
			num2=(2*num2)-1;
			System.out.print(num2);
		}
		

	}

}
