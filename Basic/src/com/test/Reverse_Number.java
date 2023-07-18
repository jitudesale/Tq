package com.test;
import java.util.*;
class Reverse
{
	public static void number()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int digit = num%10;
			sum = sum*10+digit;
			num = num/10;
		}
		System.out.println(sum);
	}
	
}
public class Reverse_Number {

	public static void main(String[] args) {
	
		Reverse.number();

	}

}
