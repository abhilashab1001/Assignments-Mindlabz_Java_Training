/*1) How to Print duplicate characters from String?
For example, if String is "Java" then the program should print "a". */

import java.util.Scanner;
public class Duplicate {  
     public static void main(String[] args) {  
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the string:");
	    String str=sc.next();
        int count;  
        char string[] = str.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
               for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                      
                    string[j] = '0';  
                }  
            }  
              
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }  
}  