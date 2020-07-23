//4.WAP to find the factorial value of any number entered through the keyboard
import java.util.Scanner;
public class Q4
{
	public static void main(String args[])
	{
		Scanner console=new Scanner(System.in);
		int num,fact=1;
		System.out.println("Enter a number:");
		num=console.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial value:"+fact);
	}
}
