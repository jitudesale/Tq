package com.interviewprogram;
import java.util.Scanner;
public class Rmove_Character {
	static void remove(String str,char c)
	{
		char ch[]=str.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			if(ch[i]==c)
			{
				ch[i]='\0';
			}
		}
		String str1=new String(ch);
		//str1=str1.replace(""," ");
		System.out.println(str1);
		
	}
	static void removemethod(String str,char c)
	{
		StringBuilder str1=new StringBuilder();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=c)
			{
				str1.append(ch[i]);
			}
			
		}
		String str2=str1.toString();
		System.out.println(str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		//str=str.replace(" ", ""); it's not neccessary to in this program because we not need to split 
		System.out.println("which character is remove");
		char ch=sc.next().charAt(0);
		Rmove_Character.remove(str, ch);
		Rmove_Character.removemethod(str,ch);

	}

}
