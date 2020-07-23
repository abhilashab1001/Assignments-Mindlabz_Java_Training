/*5) How do you find out whether the given ArrayList is empty or not?
isEmpty() method of ArrayList is used to check whether the given ArrayList is empty or not. 
This method returns true if an ArrayList contains no elements otherwise returns false.
Note : You can also use size() method to check whether the given ArrayList is empty or not. size() method returns ‘0’ if an ArrayList is empty.*/

import java.util.*; 
  
public class Example5
 { 
    public static void main(String[] args) 
    { 
  
        // Use isEmpty()) 
        ArrayList<String> str1 = new ArrayList<String>(); 
	   System.out.println("isEmpty() : "); 
	    boolean empty=str1.isEmpty();	
  	if(empty==true)
	{     
        	System.out.println("ArrayList is empty"); 

	}
	else
	{
		System.out.println("ArrayList1 is not empty"); 
	}

	
	//Size() 
	
	System.out.println("size() : "); 

	 ArrayList<String> str2 = new ArrayList<String>(); 
	
	str2.add("One");
	
	int size=str2.size();
	if(size==0)
	{     
        	System.out.println("ArrayList is Empty"); 

	}
	else
	{
		System.out.println("ArrayList is not Empty"); 
	}

	
    } 
}