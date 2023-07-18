package com.String;
import java.util.Scanner;
public class Palimdrom_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
	    String str=sc.nextLine();
	    str=str.replaceAll(" ", "");
	    char ch[]=str.toCharArray();
	    char rev[]=new char [ch.length];
	    int count=0;
	    for(int i=ch.length-1;i>=0;i--)
	    {
	    	rev[i]=ch[i];
	    	count++;
	    }
	    String strrev=String.valueOf(rev);
	    if(str.equals(strrev))
	    {
	    	System.out.println("is palimdrom");
	    }
	    else
	    {
	    	System.out.println("is not palimdrom");
	    }

	}

}
