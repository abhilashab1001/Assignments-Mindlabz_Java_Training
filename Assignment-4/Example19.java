//Methods

import java.util.*; 
  
public class Example19
 { 
    public static void main(String[] args) 
    { 
	System.out.println("..................Methods in ArrayList.....................");
	   System.out.println("1.Different ways of constructing an ArrayList::"); 
	     // create an ArrayList1
        ArrayList<String> str1 = new ArrayList<String>(); 
  
        // Initialize  with add() 
        str1.add("First"); 
        str1.add("Second"); 
        str1.add("Third"); 
  
        // print  
        System.out.println("ArrayList1 : " + str1); 

//....................................................................................................
   System.out.println("2.ensureCapacity() method::"); 
        str1.ensureCapacity(9);
	    str1.add("Fourth"); 
        str1.add("Fifth"); 
        str1.add("Sixth"); 

        // print  
        System.out.println("ArrayList : " + str1); 
//....................................................................................................
	
         System.out.println("3.trimToSize() method::");
	  str1.trimToSize();

        // print 
        System.out.println("ArrayList : " + str1);
		System.out.println(" Size :"+str1.size()); 

//.....................................................................................................
 	
         System.out.println("4.size() method::");
	
        // print list 
        System.out.println("ArrayList : " + str1);
		System.out.println(" Size :"+str1.size()); 
//.......................................................................................................
	
         System.out.println("5.isEmpty() method:");
	    boolean empty=str1.isEmpty();	
  	if(empty==true)
	{     
        	System.out.println("ArrayList is empty"); 

	}
	else
	{
		System.out.println("ArrayList1 is not empty"); 
	}
//.......................................................................................................
	
         System.out.println("6.contains() method::");
	boolean has=str1.contains("Sixth");
	if(has==true)
	{     
        	System.out.println("ArrayList contains element"); 

	}
	else
	{
		System.out.println("ArrayList doesnot contain element"); 
	}
//........................................................................................................ 

        System.out.println("7. indexOf() & lastIndexOf()::");
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

//.......................................................................................................
	
      System.out.println("8.toArray() method::");
	   ArrayList<Integer> input = new ArrayList<Integer>(); 
	input.add(1);
	input.add(2);
	input.add(3);
	input.add(4);
	input.add(5);

	
     Object[] arr=input.toArray();
	
	for (Object value : arr)
		{
         System.out.println("Value:" + value);
      }
	//.......................................................................................................		
	
         System.out.println("9.get() method:: ");
	 /*ArrayList<Integer> input = new ArrayList<Integer>(); 
	input.add(1);
	input.add(2);
	input.add(3);
	input.add(4);
	input.add(5);*/

	int val=input.get(2);
	System.out.println("Retrieved element:" + val);
   
//......................................................................................................
	
         System.out.println("10.set() method::");
	System.out.println("Before replacing:" +input);
	int value=input.set(4,25);
	System.out.println("After replacing:"+input);
//......................................................................................................

         System.out.println("11.add() method ::");

	System.out.println("Before appending " +input);
	input.add(6);
	System.out.println("After appending:" +input);
//.......................................................................................................
	
         System.out.println("12.add(index,value) method::");
	System.out.println("Before appending :" +input);
	input.add(4,7);
	System.out.println("After appending:" +input);
 //........................................................................................................
	
         System.out.println("13.remove() method::");
	System.out.println("Before removing:"+input);
	input.remove(1);
	System.out.println("After removing  :" +input);
  //........................................................................................................

    System.out.println("14.remove(Object obj) method::");
	System.out.println("Before removing:" +str2);
	str2.remove("Two");
	System.out.println("After removing:" +str2);
	//........................................................................................................
 
        System.out.println("15.clear() method::");
      System.out.println("Before removing:"+str1);
	str1.clear();
	System.out.println("After removing:" +str1);
//.........................................................................................................
	
         System.out.println("16.subList() method::");
    System.out.println("Original ArrayList:" +str1);
	List<String> str6=str2.subList(1,4);
	System.out.println("SubList :" +str6);
  //.........................................................................................................
	
         System.out.println("17.addAll() method::");
     ArrayList<String> str3= new ArrayList<String>(); 
	str3.add("One");
	str3.add("Two");
	str3.add("Three");
	System.out.println("ArrayList1"+str3);
	ArrayList<String> str4= new ArrayList<String>(); 
	str4.add("Four");
	str4.add("Five");
	System.out.println("ArrayList2:"+str4);
	str3.addAll(str4);
	System.out.println("Elements after joining:" +str3);
   //.....................................................................................................
	
        System.out.println("18.addAll(index,collection)::");
	
	ArrayList<String> str5= new ArrayList<String>(); 
	str5.add("Four");
	str5.add("Five");
	System.out.println("ArrayList2:"+str5);
	str3.addAll(3,str5);
	System.out.println("Elements after inserting:" +str3);
   
    } 
} 
