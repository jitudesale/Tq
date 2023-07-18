package com.array;
import java.util.*;
public class Second__Largest_Number {
	static void largest(int a[])
	{
		int largest=a[0];
		int secondlargest=a[0];
		int index=0;
		int secindex=0;
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]>largest)
				{
					secondlargest=largest;
					largest=a[i];
					secindex=index;
					index=i;
				}
				else if(a[i]>secondlargest)
				{
					secondlargest=a[i];
					secindex=i;
				}
		}
		System.out.println("second largest number:"+secondlargest+"\n"+"largest number:"+largest);
		System.out.println("largest element index:"+index+"\n"+"seclargest element index:"+secindex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int arr[]=new int [5];
		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Second__Largest_Number.largest(arr);

	}

}
