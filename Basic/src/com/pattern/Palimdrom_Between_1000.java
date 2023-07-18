package com.pattern;
import java.util.Scanner;
public class Palimdrom_Between_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int digit,temp, num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			temp=i;
			while(temp>0)
			{
				digit=temp%10;
				sum=sum*10+digit;
				temp/=10;
			}
			if(sum==i)
			{
				System.out.println("palimdrom:"+i);
			}
			sum=0;
		}

	}

}
