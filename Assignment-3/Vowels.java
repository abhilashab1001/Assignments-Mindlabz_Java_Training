/*6) How to count a number of vowels and consonants in a String?
One of the easiest String questions you will ever see. 
You have to write a Java program that will take a String input and print out a number of vowels and consonants on that String.
 For example, if the input is "Java" then your program should print "2 vowels and 2 consonants".*/

import java.util.Scanner;
public class Vowels 
{ 
public static void main(String[] args)
 {
Scanner sc =new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
int count=0,count1=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'|| str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'|| str.charAt(i)=='i'||str.charAt(i)=='I'||+
str.charAt(i)=='O'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='u')
{
count++;
}
else
count1++;
}
System.out.println("Vowels:"+count);
System.out.println("consonants:"+count1);
 }
}
