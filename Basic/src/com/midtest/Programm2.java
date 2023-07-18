package com.midtest;

class NotEligibleForVaccineException extends Exception
{
	public NotEligibleForVaccineException(String msg)
	{
		super(msg);
	}

	
		
	}


public class Programm2 {
	


	public void age(int age)throws NotEligibleForVaccineException 
	{
		
		
		if(age<60)
		{
			throw new NotEligibleForVaccineException("Invalid");
		}
		
		
		
	}
	
	

	public static void main(String[] args) {
		Programm2 e = new Programm2();
	try
	{
		e.age(45);
	}
	catch(NotEligibleForVaccineException n)
	{
		System.out.println(n);
	}
	System.out.println("All Okk");

	}

}
