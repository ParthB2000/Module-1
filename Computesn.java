/*Write a Java program that accepts an integer (n) and computes the value 
of n+nn+nnn.
Input number: 5
5 + 55 + 555*/

import java.util.Scanner;

public class Computesn 
	{
	
	public static void main(String[] args) 
	{
	
		int n;
		System.out.println("Enter a value of n");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		
		System.out.printf("%d + %d%d + %d%d%d",n,n,n,n,n,n);
		
	}	
	}
