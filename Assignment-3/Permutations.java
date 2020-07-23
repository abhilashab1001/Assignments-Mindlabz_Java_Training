/*9) How to find all permutations of String?
Write a program to print all permutations of a String in Java,
 for example, if the input is "xyz" then it should print "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".*/
 
 import java.util.Scanner;
public class Permutations
 {

public static void permutation(String input,String result)
{
	if(input.length()==0)
	{
		System.out.println(result+"    ");
		return;
	}
for (int i = 0; i < input.length(); i++)
	{
		char c=input.charAt(i);
		String s=input.substring(0,i)+input.substring(i+1);
		permutation(s,result+c);
	}
}
public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the string:");
	 String str=sc.nextLine();
permutation(str,"");
}



}

