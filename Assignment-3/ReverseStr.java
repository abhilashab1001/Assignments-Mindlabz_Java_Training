/*4) How to reverse String in Java using Iteration and Recursion?
Your task is to write a program to reverse String in Java without using the StringBuffer class. 
You also need to provide both iterative and recursive algorithms for String reversal.
 You can use other String utility methods e.g. charAt(), toCharArray() or substring() from java.lang.String class.*/
 import java.util.Scanner;
class ReverseStr
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
char[] arr=str.toCharArray();
for (int i=arr.length-1;i>=0 ; i--)
{
System.out.print(arr[i]);
}
}
}
