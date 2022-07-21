/*Write a Java program that reads a positive integer and count the number 
of digits the number.nput an integer number less than ten billion: 125463 Number of digits in 
the number: 6.*/

import java.util.Scanner;

public class Positive_integer 
{
	public static void main(String[] args) 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive integer number");
		int num = sc.nextInt();
		
		while(num != 0) 
		{
			num = num/10;
			count++;
		}
		System.out.println("Number digit is " + count);
	}
}
