/*17) How do you join two ArrayLists?
We can use addAll() method which takes Collection type as an argument to join two ArrayLists. 
This method appends all elements of the passed collection to the end of the invoking collection.*/
import java.util.*; 
  
public class Example17
{ 
    public static void main(String[] args) 
    { 
	 ArrayList<String> str3= new ArrayList<String>(); 
	str3.add("Monday");
	str3.add("Tuesday");
	str3.add("Wednesday");
	System.out.println("ArrayList1"+str3);
	ArrayList<String> str4= new ArrayList<String>(); 
	str3.add("Thursday");
	str3.add("Friday");
	System.out.println("ArrayList2:"+str4);
	str3.addAll(str4);
	System.out.println("Elements after joining:" +str3);
    } 
} 

