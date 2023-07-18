package com.test;
import java.util.Scanner;
class Factor
{
	public static void number()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			 fact=fact*i;
		}
		System.out.println(fact);
	}
}
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factor.number();

	}

}
