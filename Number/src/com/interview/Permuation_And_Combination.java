package com.interview;
import java.util.Scanner;
public class Permuation_And_Combination {
	

	    public static long maximum(long number, int partSize) {
	        String num = Long.toString(number);//this line is signature line in code
	        
	        if (num.length() < partSize) {
	            
	        }
	        
	        long maxProduct = 0;
	        
	        for (int i = 0; i <= num.length() - partSize; i++) {
	            long product = 1;
	            
	            for (int j = i; j < i + partSize; j++) {
	                int digit = Character.getNumericValue(num.charAt(j));
	                product *= digit;
	            }
	            
	            if (product > maxProduct) {
	                maxProduct = product;
	                
	            }
	            System.out.println(maxProduct);
	            
	        }
	        
	        return maxProduct;
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter number");
	        long number = sc.nextLong();
	        System.out.println("How Much part");
	        int partSize = sc.nextInt();
	        
	        long maxProduct = maximum(number, partSize);
	        System.out.println("Maximum product: " + maxProduct);
	        //Permuation_And_Combination.maximum(number, partSize);
	    }
	}



