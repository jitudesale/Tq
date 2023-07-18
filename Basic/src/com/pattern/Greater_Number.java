package com.pattern;
import java.util.Scanner;
public class Greater_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			int digit=num%10;
			count++;
			num/=10;
		}
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(i>j)
				{
					System.out.println(i);
				}
			}
		}

	}

}
