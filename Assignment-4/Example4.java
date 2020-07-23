/*4) How do you find the number of elements present in an ArrayList?
Using size() method. size() method returns number of elements present in an ArrayList.*/

import java.util.*; 
  
public class Example4 { 
    public static void main(String[] args) 
    { 
  
        // create an ArrayList 
        ArrayList<String> str1 = new ArrayList<String>(); 
  
	
        // Initialize with add() 
        str1.add("First"); 
        str1.add("Second"); 
        str1.add("Third"); 
  
	
        // print list 
        
        System.out.println("ArrayList : " + str1);
		System.out.println(" Size :"+str1.size()); 


    } 
} 
	
