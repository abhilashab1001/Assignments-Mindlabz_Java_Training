/*11) How do you append an element at the end of an ArrayList?
add() method appends an element at the end of an ArrayList.*/

import java.util.*; 
  
public class Example11
 { 
    public static void main(String[] args) 
    { 
	ArrayList<Integer> input = new ArrayList<Integer>(); 
	input.add(1);
	input.add(2);
	input.add(3);
	input.add(4);
	input.add(5);

	System.out.println("Before appending " +input);
	input.add(6);
	System.out.println("After appending:" +input);
    } 
} 
