/* WAP that prompts the user to input an integer & then outputs the number with the
digits reversed. for ex,if the input is 12345, the output should be 54321.*/

import java.util.Scanner;
public class Q6
{
	public static void main(String args[])
	{
		int num,reversenum=0;
		System.out.println("Enter a number:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		while(num>0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("Reverse of the given number is:"+reversenum);
	}
}
	
