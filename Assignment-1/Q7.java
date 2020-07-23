//WAP that reads a set of integers and then prints the sum of the even & odd integers.

import java.util.Scanner;

//WAP that reads a set of integers & then prints the sum of the even & odd integers.

public class Q7
{
	public static void main(String[] args)
	{
		int num,sumeven=0,sumodd=0;
		Scanner console=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		num=console.nextInt();
		int[] a=new int[num];
		System.out.println("Enter the elements of array:");
		
		for(int i=0;i<num;i++)
		{
			a[i]=console.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			if(a[i]%2==0)
			{
				sumeven=sumeven+a[i];
			}
			else
			{
				sumodd=sumodd+a[i];
			}
		}
		System.out.println("Sum of even numbers:"+sumeven);
		System.out.println("Sum of odd numbers:"+sumodd);
	}
}