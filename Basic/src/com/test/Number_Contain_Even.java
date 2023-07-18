package com.test;
import java.util.*;
public class Number_Contain_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		double avg=0;
		while(num>0)
		{
			int digit=num%10;
			num/=10;
			if(digit%2==0)
			{
				System.out.println(digit);
				count++;
				sum=digit+sum;
			}
		}System.out.println("sum:"+sum);
		avg=(double)sum/count;
		System.out.println("avg:"+avg);

	}

}
