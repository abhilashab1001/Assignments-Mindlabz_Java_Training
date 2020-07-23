/*6) How do you check whether the given element is present in an ArrayList or not?
Using contains() method of ArrayList, we can examine whether the ArrayList contains the given element or not. 
This method returns true if ArrayList has that element otherwise returns false.*/
import java.util.*; 
  
public class Example6
 { 
    public static void main(String[] args) 
    { 
  

	 ArrayList<String> str1= new ArrayList<String>(); 
	str1.add("First");
	str1.add("Second");
	str1.add("Third");
	str1.add("Fourth");
	str1.add("Fifth");
	
	boolean has=str1.contains("Sixth");
	if(has==true)
	{     
        	System.out.println("ArrayList contains element"); 

	}
	else
	{
		System.out.println("ArrayList doesnot contain element"); 
	}

	
    } 
} 

