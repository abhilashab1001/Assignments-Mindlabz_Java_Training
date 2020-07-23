/*10) How do you replace a particular element in an ArrayList with the given element?
set() method replaces a particular element in an Arraylist with the given element. This method takes two arguments.
 One is the index of the element to be replaced and another one is the element to be placed at that position.*/
 import java.util.*; 
  
public class Example10
{ 
    public static void main(String[] args) 
    { 
	 ArrayList<Integer> input = new ArrayList<Integer>(); 
	input.add(1);
	input.add(2);
	input.add(3);
	input.add(4);
	input.add(5);

	System.out.println("Before replacing:" +input);

	int value=input.set(4,25);
	System.out.println("After replacing:"+input);
    } 
} 

