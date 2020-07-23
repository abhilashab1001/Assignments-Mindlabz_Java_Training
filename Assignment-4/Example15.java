/*15) How do you remove all elements of an ArrayList at a time?
clear() method removes all elements of an ArrayList. ArrayList will be empty after this method is executed.*/
import java.util.*; 
  
public class Example15
 { 
    public static void main(String[] args) 
    { 
	 ArrayList<String> str2= new ArrayList<String>(); 
    str2.add("Monday");
	str2.add("Tuesday");
	str2.add("Wednesday");
	str2.add("Thursday");
	str2.add("Friday");
     System.out.println("Before removing:"+str2);
	str2.clear();
	System.out.println("After removing:" +str2);
    } 
 }

