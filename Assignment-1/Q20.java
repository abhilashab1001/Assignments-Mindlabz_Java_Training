
/*Write a program to compute the cosine of x. The user should supply x and a positive integer n. We compute the cosine of x using the series and the computation should use all terms in the series up through the term involving xn

cos x = 1 - x2/2! + x4/4! - x6/6! .....*/

import java.util.Scanner;
public class Q20
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n,fact;
		float x,sum=0;
		int cosx=-1;
		float prod=1;
		System.out.print("Enter value x:");
		x=sc.nextInt();
		System.out.print("Enter value n:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i+=2)
		{
			fact=1;
			for(j=1;j<=i;j++)
			{
				prod=prod*x;;
				fact=fact*j;
			}
			
			sum=sum+cosx*prod/fact;
			cosx=-1*cosx;
		}
		System.out.print("cos="+(sum+1));
		
	}
}