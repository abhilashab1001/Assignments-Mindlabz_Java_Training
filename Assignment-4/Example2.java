/*2) How do you increase the current capacity of an ArrayList?

ensureCapacity() method is used to increase the current capacity of an ArrayList. 
However, capacity of an ArrayList is automatically increased when we try to add more elements than the current capacity.
 To manually increase the current capacity, ensureCapacity() method is used.*/


import java.util.*; 
  
public class Example2 { 
    public static void main(String[] args) 
    { 
  
        // create an ArrayList
        ArrayList<String> str1 = new ArrayList<String>(5); 
  
        // Initialize an ArrayList with add() 
        str1.add("First"); 
        str1.add("Second"); 
        str1.add("Third"); 
  
	    str1.ensureCapacity(9);
	    str1.add("Fourth"); 
        str1.add("Fifth"); 
        str1.add("Sixth"); 

        // print  
        System.out.println("ArrayList : " + str1); 



    } 
} 