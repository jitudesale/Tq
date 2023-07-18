package com.pattern;
import java.util.Scanner;
public class Aramstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int digit,temp,num=sc.nextInt();
		//System.out.println(digit+""+temp);
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			temp=i;
			while(temp>0)
			{
				digit=temp%10;
				sum=sum+(digit*digit*digit);
				temp=temp/10;
			}
			if(sum==i)
			{
				System.out.println("Aramstrong number:"+i);
			}
			sum=0;
		}

	}

}
