/*5) How to find duplicate characters in a String?
You need to write a program to print all duplicate character and their count in Java.
 For example, if given String is "Programming" then your program should print
g : 2
r : 2
m : 2*/

import java.util.Scanner;
public class Count 
{  
     public static void main(String[] args)
	 {  
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the string:");
	   String str=sc.nextLine();
	  // Character.toLowerCase(str.charAt(i))
	    //char[] chars = str.toLowerCase().toCharArray(); 
	   for(int i=0;i<str.length();i++)
	   {
	    int count=1;
	   int flag=0,j;
	   for(j=i+1;j<str.length();j++)
	   {
	   if(Character.toLowerCase(str.charAt(i))==Character.toLowerCase(str.charAt(j)))
	   {
	   flag=1;
	   count++;
	   break;
	   }
	   }
	   if(flag==1)
	   {
	   System.out.println(str.charAt(j)+"::"+count);
	   }
	  }
	  }
  }