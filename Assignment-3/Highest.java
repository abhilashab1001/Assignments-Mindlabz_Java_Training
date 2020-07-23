/*
12) How to return the highest occurred character in a String?
You need to write a function to implement an algorithm that will accept a string of characters and
 should find the highest occurrence of the character and display it.
 For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a"*/ 
 import java.util.*;
 public class Highest
 
 {
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string:");
		 String str=sc.nextLine();
		 char c= ' ';
		 int count=1;
		 int flag=0;
		 int j=0;
		 int lastcount=1;
		 int max=1;
		 System.out.println();
		 for(int i=0;i<str.length();i++)
		 {
			   count=1;
		        flag=0;
			 for(j=i+1;j<str.length();j++)
			 {
				 if(str.charAt(i)==str.charAt(j))
				 {
					 flag=1;
					 count++;
				 }
			 }
			 if(flag==1)
			 {
				 if(max<=count)
				 {
					 max=count;
					 c=str.charAt(i);
					 lastcount=count;
				 }
				 lastcount=count;
			 }
		 }
		 System.out.println(c+" :: "+max);
	 }
 }
				 