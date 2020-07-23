/*13) How do you remove an element from a particular position of an ArrayList?
remove() method which takes int type as an argument is used to remove an element 
from a particular position of an ArrayList.*/
import java.util.*; 
  
public class Example13
 { 
    public static void main(String[] args) 
    { 
	 ArrayList<Integer> input = new ArrayList<Integer>(); 
	input.add(1);
	input.add(2);
	input.add(3);
	input.add(4);
	input.add(5);
	System.out.println("Before removing:"+input);
	input.remove(1);
	System.out.println("After removing  :" +input);
 
    } 
} 
