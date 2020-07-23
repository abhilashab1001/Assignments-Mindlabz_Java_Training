/*18) How do you insert more than one element at a particular position of an ArrayList?
Another version of addAll() method which takes two arguments, one is index and another one
 is Collection type, can be used for this requirement. This method inserts all of the elements
 of passed collection at a specified position of an ArrayList.*/
 import java.util.*; 
  
public class Example18
 { 
    public static void main(String[] args) 
    { 
	 ArrayList<String> str3= new ArrayList<String>(); 
	str3.add("Monday");
	str3.add("Tuesday");
	str3.add("Wednesday");
	System.out.println("ArrayList1:"+str3);
	ArrayList<String> str5= new ArrayList<String>(); 
	str5.add("Thursday");
	str5.add("Friday");
	System.out.println("ArrayList2:"+str5);
	str3.addAll(3,str5);
	System.out.println("Elements after inserting:" +str3);
    } 
} 
