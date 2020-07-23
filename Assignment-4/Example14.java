/*14) How do you remove the given element from an ArrayList?
remove(Object obj) method removes the first occurrence of the specified element ‘obj‘.
 If that element doesn’t exist, ArrayList will be unchanged.*/
 import java.util.*; 
  
public class Example14
 { 
    public static void main(String[] args) 
    { 
	 ArrayList<String> str2= new ArrayList<String>(); 
	str2.add("Monday");
	str2.add("Tuesday");
	str2.add("Wednesday");
	str2.add("Thursday");
	str2.add("Friday");
	System.out.println("Before removing:" +str2);
	str2.remove("Tuesday");
	System.out.println("After removing:" +str2);
    } 
} 
