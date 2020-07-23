/*7) How do you get the position of a particular element in an ArrayList?
We can use indexOf() and lastIndexOf() methods to find out the position of a given element in an ArrayList. 
indexOf() method returns index of first occurrence of a specified element where as lastIndexOf() method returns 
index of last occurrence of a specified element in an ArrayList. If element is not found, they will return -1.*/
import java.util.*; 
  
public class Example7
 { 
    public static void main(String[] args) 
    { 
	 ArrayList<String> str2 = new ArrayList<String>(); 
	str2.add("Monday");
	str2.add("Tuesday");
	str2.add("Wednesday");
	str2.add("Thursday");
	str2.add("Friday");
	
	int in=str2.indexOf("Tuesday");
	System.out.println("Index:"+in); 
	
	int inof=str2.lastIndexOf("Tuesday");
	System.out.println("Last Index :"+inof); 

	
    } 
} 