package com.array;
import java.util.*;
public class Odd_Even_Array {
	static void even(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
					
				}
				else
				{
					System.out.println("Odd:"+a[i]);
				}
			
		}System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]=new int [7];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Odd_Even_Array.even(arr);

	}

}
