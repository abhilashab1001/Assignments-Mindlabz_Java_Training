/*
**
***
****  */

public class Q18ii
{ 
    public static void star(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) 
            {           
            for(j=0; j<=i; j++) 
            {       
                System.out.print("* "); 
				}           
            System.out.println(); 
			}
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        star(n); 
    } 
	}
	
