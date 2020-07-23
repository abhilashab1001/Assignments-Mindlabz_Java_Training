/*12) How do you insert an element at a particular position of an ArrayList?
add() method which takes index and an element as arguments can be used to insert 
an element at a particular position of an ArrayList. The elements at the right side of that
 position are shifted one position right i.e indices of right side elements of that position are increased by 1.*/
 

import java.util.*; 
  
public class Example12
 { 
    public static void main(String[] args) 
    { 
	 ArrayList<Integer> input = new ArrayList<Integer>(); 
     input.add(1);
	input.add(2);
	input.add(3);
	input.add(4);
	input.add(5);
	System.out.println("Before appending :" +input);
	input.add(4,7);
	System.out.println("After appending:" +input);
    } 
} 
