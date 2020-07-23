//1) Explain the different ways of constructing an ArrayList?

import java.util.*; 
  
public class Example1
{ 
    public static void main(String[] args) 
    { 
  
        // create an ArrayList1
        ArrayList<String> str1 = new ArrayList<String>(); 
  
        // Initialize  with add() 
        str1.add("First"); 
        str1.add("Second"); 
        str1.add("Third"); 
  
        // print  
        System.out.println("ArrayList1 : " + str1); 


	 // create an 2nd ArrayList 
        ArrayList<String> str2 = new ArrayList<String>()
		{ 
  
       		{ //  with add() 
       		add("First"); 
        	add("Second"); 
        	add("Third"); 
 		}
	 };
        // print 
        System.out.println("2nd ArrayList: " + str2);
	
	  // create an 3rd ArrayList
        ArrayList<String> str3 = new ArrayList<String>(Arrays.asList("First","Second","Third")); 
        // print
        System.out.println("3rd ArrayList: " + str3);

	 // create an 4thArrayList
        
	List<String> str4 = new ArrayList<>(List.of("First","Second","Third")); 
       
	 // print 
        System.out.println("4th ArrayList: " + str4);

	 // create an 5th ArrayList
        
	List<String> str5 = new ArrayList<>(); 
	
	str5.add("First");
	str5.add("Second");
	str5.add("Third");
       
	 // print
        System.out.println(" 5th ArrayList: " + str5);
	
	 

    } 
} 