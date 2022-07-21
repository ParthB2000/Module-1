
/*Write a Java program that takes the user to provide a single character 
from the alphabet. Print Vowel or Consonant, depending on the user 
input. If the user input is not a letter (between a and z or A and Z), or is a 
string of length > 1, print an error message.*/

import java.util.Scanner;

public class VowelorConsonant {
	private static Scanner s;

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		System.out.println("Enter a character");
		
		
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println(ch+ " is vowel");
		}
		else
		{
			System.out.println(ch+ " is consonant");
		}
	}
	}


