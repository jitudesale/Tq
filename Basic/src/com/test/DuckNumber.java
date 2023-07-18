package com.test;
import java.util.Scanner;
public class DuckNumber {
	static void number(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		char c;
		for(int i=0;i<ch.length;i++)
		{
			//c=s.charAt(i);
			if(ch[i]=='0')
			{
				count++;
			}
		}
		boolean iszero=false;
		if(s.charAt(0)=='0')
		{
			iszero=true;
		}
	if(iszero==false&&count==1)
	{
		System.out.println("duck");
	}
	else
	{
		System.out.println("is not duck");
	}
		
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		String str=sc.nextLine();
		 DuckNumber.number(str);

	}

}
