/*Two numbers are entered through the keyboard. WAP to find the value of one number 
raised to the power of another.(Do not use java built-in method)*/
 
 import java.util.Scanner;
 public class Q5
 {
	 public static void main(String args[])
	 {
		 Scanner console=new Scanner(System.in);
		 int base,power,result=1;
		 System.out.println("Enter the base value:");
		 base=console.nextInt();
		 System.out.println("Enter the power value:");
		 power=console.nextInt();
		 
		 for(int i=1;i<=power;i++)
		 {
		    result=result*base;
		 }
       System.out.println("Result:"+result);
	 }
 }
 
		 