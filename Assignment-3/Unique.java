//3) How to program to print first non repeated character from String?

 import java.util.Scanner;
 public class Unique{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the String: ");
String str=sc.next();
char[] arr=new char[str.length()];
for(int j=0;j<arr.length;j++)
{
arr[j]=str.charAt(j);
}
char found=searchchar(str,arr);
System.out.println("First non-repeated character is: "+found);
}


public static char searchchar(String a,char[] b)
{
int i=0;
while(i!=a.length())
{
int count=0;
for(int j=0;j<b.length;j++)
{
if(i!=j)
{
if(a.charAt(i)!=b[j])
{
count++;
}
}
if(count==a.length()-1)
{
return a.charAt(i);
}
}
i++;
}
return 0;
}
}
