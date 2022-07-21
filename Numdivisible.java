
/*Write a Java program to print numbers between 1 to 100 which are 
divisible by 3, 5 and by both.*/

import java.util.Scanner;

public class Numdivisible 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Number divisible by 3");
		for(i=1;i<=100;i++)
		{
			
			if(i%3==0)
			
				System.out.println(i);
			}
			System.out.println("Number divisible 5");
			for(i=1;i<=100;i++) 
			{
			if(i%5==0)
			
				System.out.println(i);
			}
			System.out.println("Number divisible 3 & 5");
			for(i=1;i<=100;i++) 
			
			if(i%3==0 && i%5==0)
				System.out.println(i);
			{
				System.out.println();
			}
		
	}
}
