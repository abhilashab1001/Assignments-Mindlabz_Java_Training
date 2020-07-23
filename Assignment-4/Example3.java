/*3) How do you decrease the current capacity of an ArrayList to the current size?
trimToSize() method is used to trim the capacity of arrayList to the current size of ArrayList.
 Developers use this method to minimize the storage area of an ArrayList.*/
 
import java.util.*; 
  
public class Example3
 { 
    public static void main(String[] args) 
    { 
  
        // create an ArrayList
        ArrayList<String> str1= new ArrayList<String>(5); 
  
	
        // Initialize an ArrayList with add() 
        str1.add("First"); 
        str1.add("Second"); 
        str1.add("Third"); 
  
	  str1.trimToSize();

        // print 
        System.out.println("ArrayList : " + str1);
		System.out.println(" Size :"+str1.size()); 



    } 
} 

