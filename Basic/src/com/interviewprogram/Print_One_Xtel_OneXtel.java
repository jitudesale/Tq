package com.interviewprogram;
import java.util.Scanner;
public class Print_One_Xtel_OneXtel {
	static void onextel(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println("Onextel");
			}
			else if(i%3==0)
			{
				System.out.println("One");
			}
			else if(i%5==0)
			{
				System.out.println("Xtel");
			}
			else
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		Print_One_Xtel_OneXtel.onextel(num);

	}

}
