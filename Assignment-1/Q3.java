//3.WAP that prompts the user to input a positive integer. It should then print the multiplication table of that number.

import java.util.Scanner;
public class Q3
{
	public static void main(String args[])
	{
		Scanner console=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=console.nextInt();
		if(number>=0){
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+ "*" +i+ "=" +(number*i));
		}
		}
		else 
			System.out.println("Enter a positive number");
	}
}