package com.pattern;
import java.util.Scanner;
public class Fascinnated_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num2=num*2;
		int num3=num*3;
		String str=num+""+num2+num3;
		boolean isfound=true;
		for(int c='1';c<='9';c++)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
			     char ch=str.charAt(i);
			     if(ch==c)
			     {
			    	 count++;
			     }
			}
			if(count>1||count==0)
			{
				isfound=false;
			}
		}
		if(isfound)
		{
			System.out.println("is fascinated");
		}
		else
		{
			System.out.println("is not fascinated");
		}

	}

}
