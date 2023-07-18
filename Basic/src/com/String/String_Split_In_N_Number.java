package com.String;
import java.util.Scanner;
public class String_Split_In_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		str=str.replace(""," ");
	    System.out.println("Enter split index");
	    int n=sc.nextInt();
	    int chars=str.length()/n;
	    String st[]=new String [n];
	    int temp=0;
	    if(str.length()!=0)
	    {
	    	System.out.println("String cannot divided in equal part");
	    }
	    else
	    {
	    	for(int i=0;i<str.length();i=chars+i)
	    	{
	    		st[temp]=str.substring(i,i+chars);
	            temp++;
	    	}
	    	System.out.println(n+"equals parts");
	    	for(int i=0;i<st.length;i++)
	    	{
	    		System.out.println(st[i]);;
	    	}
	    }
	    

	}

}
