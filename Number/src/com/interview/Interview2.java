package com.interview;
import java.util.Scanner;
public class Interview2 {
	public static void series(int num)
	{
		int prod=1;
		int count=0;
		int temp=num;
		int temp1=0;
		while(count<=2)
		{
		
			int digit=(num%10);
			count++;
			prod=prod*digit;
			num=num/10;
			if(count==1)
			{
				temp1=num;
			}
		}
		System.out.println(prod);
		num=temp1;
		int prod1=1;
		int count1=0;
		int temp2=0;
		while(count1<=2)
		{
			int digit1=num%10;
			count1++;
			prod1=prod1*digit1;
			num=num/10;
			if(count1==1)
			{
				temp2=num;
			}
		}
		System.out.println(prod1);
		num=temp2;
		int count2=0;
		int prod2=1;
		while(count2<=2)
		{
			int digit=num%10;
			count2++;
			prod2=prod2*digit;
			num=num/10;
		}
		System.out.println(prod2);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Interview2.series(num);

	}

}
