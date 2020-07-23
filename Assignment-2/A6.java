/*6.WAP to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim'
takes length & breadth of rectangle as parameters & the second method named as 'getArea' returns the areaof the rectangle.
Length & breadth of rectangle are entered through keyboard.  */

import java.util.Scanner;
 
class Area{


int length,breadth;

Scanner sc=new Scanner(System.in);
public void setDim(){
		System.out.println("Enter the length :");
		length =sc.nextInt();
		System.out.println("Enter the breadth:");
		breadth=sc.nextInt();
	
}
 public void getArea(){
int results = length * breadth;
System.out.println("RectArea = " +  results);
}
}
class A6
{
public static void main(String []args){
Area x =new Area();
x.setDim();
x.getArea();
    
}
}