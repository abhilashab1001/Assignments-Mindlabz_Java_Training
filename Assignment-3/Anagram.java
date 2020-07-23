/*2) How to check if two Strings are anagrams of each other?
A simple coding problem based upon String, but could also be asked with numbers. 
You need to write a Java program to check if two given strings are anagrams of Each other. 
Two strings are anagrams if they are written using the same exact letters, ignoring space, punctuation, and capitalization.
 Each letter should have the same count in both strings. For example, the Army and Mary are an anagram of each other.*/
import java.util.Scanner; 

 public class Anagram 
  { 
    public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1=sc.nextLine();
		System.out.println("Enter the next string:");
		String str2=sc.nextLine();
		int count=0;
		
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				for(int j=0;j<str2.length();j++)
				{
					if(Character.toLowerCase(str1.charAt(i))==Character.toLowerCase(str2.charAt(j)))
					{
						count++;
						break;
					}
				}
			}
			if(count==str1.length())
			{
				System.out.println("Both strings are anagram of each other");
			}
			else
			{
				System.out.println("Both strings are not anagram of each other");
			}
		}
		else
		{
			System.out.println("Length of the strings are not equal");
		}
	}
  }
  
			
	