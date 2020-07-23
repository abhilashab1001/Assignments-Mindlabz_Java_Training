/*16) How do you retrieve a portion of an ArrayList?
Using subList() method of ArrayList, we can retrieve a portion of an ArrayList. 
subList() method returns a view of a portion of an ArrayList in the given range.
 The returned subList is backed by original ArrayList. That means any changes made to subList
 will be reflected in original ArrayList or Vice-Versa.*/
 import java.util.*; 
  
public class Example16
{ 
    public static void main(String[] args) 
    { 
	 ArrayList<String> str2= new ArrayList<String>(); 
    str2.add("Monday");
	str2.add("Tuesday");
	str2.add("Wednesday");
	str2.add("Thursday");
	str2.add("Friday");
	System.out.println("Original ArrayList:" +str2);
	List<String> str6=str2.subList(1,4);
	System.out.println("SubList :" +str6);
    } 
} 
