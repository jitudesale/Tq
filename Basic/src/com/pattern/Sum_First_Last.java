package com.pattern;
import java.util.Scanner;
public class Sum_First_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int sum=0;
		int count=0;
		int digit;
	   int last=digit=num%10;
		while(num>0)
		{
			  digit=num%10;
			
			 num=num/10;
		}
		sum=last+digit;
		System.out.println(sum);

	}
	

}
