/*Write a Java program to Take three numbers from the user and print the 
greatest number.*/

import java.util.Scanner;

public class Number {
	int num;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter a 2nd number");
		int num2=sc.nextInt();
		System.out.println("Enter a 3rd number");
		int num3=sc.nextInt();

		System.out.println("The gratest nimber is: ");
		if(num1>num2 & num1>num3)
			
		{
			System.out.println(num1);
		}
		else if(num2>num3 & num2>num1)
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
		}

		
	}

}
