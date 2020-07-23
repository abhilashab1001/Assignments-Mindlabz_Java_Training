/*8) How do you convert an ArrayList to Array?
Using toArray() method of ArrayList class. toArray() method returns an array containing all elements of the ArrayList. 
This method acts as a bridge between normal arrays and collection framework in java.*/

import java.util.*; 
  
public class Example8
{ 
    public static void main(String[] args) 
    { 
	 ArrayList<Integer> input = new ArrayList<Integer>(); 
	input.add(1);
	input.add(2);
	input.add(3);
	input.add(4);
	input.add(5);

	Object[] arr=input.toArray();
	
	for (Object value : arr)
		{
         System.out.println("Value:" + value);
      }
	
    } 
} 
