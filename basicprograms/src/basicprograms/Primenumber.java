package basicprograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) 
	{
		int temp=0;
		boolean isprime=true;
		Scanner sca= new Scanner(System.in);
		System.out.println("enter a number");
		int num=sca.nextInt();
		for (int i = 2; i < num/2; i++) 
		{
			temp=num%i;
			if(temp==0)
			{
				isprime=false;
				break;
			}
			
		}
		if(isprime) {
			System.out.println("is prime number");
		}
		else
		{
			System.out.println("is not prime number");
		}
	}
	
	}
		
		