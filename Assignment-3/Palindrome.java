/*10) How to check if String is Palindrome?
For example, if the input is "radar", the output should be true, if the input is "madam" output will be true,
 and if the input is "Java" output should be false.*/

import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
String str = null;
str = sc.nextLine();
int StringLen = str.length();

for(int i = 0; i < StringLen/2; i++)
{
if(str.charAt(i) == str.charAt(StringLen-1-i))
{
System.out.println("True");
}
else
{
System.out.println("False");
}
}
	}
}