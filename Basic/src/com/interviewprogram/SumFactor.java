package com.interviewprogram;
import java.util.Scanner;
public class SumFactor {
	// perfect number
	public static void sumOffactors(int number) {
        int sum = 0;
        
        for (int i = 1; i < number ; i++) {//if loop is iterate upto the number is consider it self also
            if (number % i == 0) {
                sum += i;
            }
           
        }
        if(sum==number)
        {
        	System.out.println(number);
        }
        else
        {
        	System.out.println("Sum of factors of"+number+"!="+sum);
        }
        
        
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number");
        int number = sc.nextInt() ;
        SumFactor.sumOffactors(number);
        
        
    }
    

}
