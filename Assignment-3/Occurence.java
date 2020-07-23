/*7) How to count the occurrence of a given character in String?
Your method must return a count of a given character.
for example, if input String is "Java" and given character is 'a' then it should return 2.*/

import java.util.Scanner;
public class Occurence
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Wnter the string:");
		String str=sc.nextLine();
		System.out.println("Enter character:");
		char c=sc.next().charAt(0);
		int count=0;
		System.out.println("Result:");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				count+=1;
			}
		}
		if(count==0)
		{
			System.out.println("Character not found");
		}
		else
		{
			System.out.println(c+"   " +count);
		}
	}
}
