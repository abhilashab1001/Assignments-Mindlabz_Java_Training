/*9) How do you retrieve an element from a particular position of an ArrayList?
get() method returns an element from a specified position of an ArrayList. This method takes index of the element as an argument.*/

import java.util.*; 
  
public class Example9
 { 
    public static void main(String[] args) 
    { 
	 ArrayList<Integer> input = new ArrayList<Integer>(); 
	input.add(1);
	input.add(2);
	input.add(3);
	input.add(4);
	input.add(5);

	int val=input.get(2);
	System.out.println("Retrieved element:" + val);
    } 
} 

