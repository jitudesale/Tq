package com.String;
import java.util.*;
public class DuplicateWordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String []str1=str.split(" ");
		int wrc=1;
		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i].equals(str1[j]))
				{
					wrc++;
					str1[j]="0";
				}
			}
			if(str1[i]!="0")
			{
				if(wrc>1)
				System.out.println(str1[i]+"="+wrc);
			}
			//wrc=1;
		}

	}

}
