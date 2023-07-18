package com.midtest;

import java.util.Arrays;

public class Programm {

	public static void main(String[] args) {
		String str = "thin sticks";
		String str1="thick bricks";
		String str2=str.replace(" ", "");
		String str3=str1.replace(" ", "");
		char ch[]=str2.toCharArray();
		char ch1[]=str3.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		int k=0;
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(ch[i]==ch1[j])
				{
					k++;
				}
				
			}
			if(k>1)
			{
				System.out.println(ch[i]);
			}
			
		}
		
	
		

}
}