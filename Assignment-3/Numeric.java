/*8) How to convert numeric String to an int?
For example, if you pass "67263" to the program then it should return 67263.*/

import java.util.Scanner;
 public class Numeric
 {
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the numeric string:");
    String str =sc.nextLine();
    int num = Integer.parseInt(str);
    System.out.println("Actual String:"+ str);
    System.out.println("Converted to Int:" + num);
   
  }
}