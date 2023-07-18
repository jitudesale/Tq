package com.test;
import java.util.*;
public class Fascnumber {
	static void number()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		int n1=num*2;
		int n2=num*3;
		String str=num+""+n1+n2;
		boolean isfound=true;
		for(char c='1';c<='9';c++)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				char ch= str.charAt(i);
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
			System.out.println("fascinated");
		}
		else
		{
			System.out.println("is not fascinated");
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fascnumber.number();

	}

}
