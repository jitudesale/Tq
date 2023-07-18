package com.pattern;
import java.util.*;
public class Right_Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
