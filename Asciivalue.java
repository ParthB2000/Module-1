/*Write a Java program to print the ASCII value of a given character.*/

import java.util.Scanner;

public class Asciivalue 
	{
		public static void main(String[] args) 
		{
			char ch;
			Scanner r = new Scanner(System.in);
			
			System.out.println("Enter any character");
			ch = r.next().charAt(0);
			
			int a = ch;
			System.out.println("The Ascii value of " + " is " +a);
		}
	}
