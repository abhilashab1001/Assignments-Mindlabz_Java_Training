import java.io.*; 
import java.util.*;
class Ex6
{ 

public static void main(String[] args) throws IOException 
{ 
 
String str = "No matter how positive a person you are, you are not a machine. It is easy to get the wind knocked out of you when the obstacles of modern life get in your way. However, despite how bad things get, the truth is that you are not alone − everyone finds themselves feeling deflated or uninspired at some point. So, if you're in need of a confidence boost, some inspiring advice or simply something to psyche yourself up for another day surviving the battle ";
FileWriter fw=new FileWriter("test.txt");  
for (int i=0;i<str.length(); i++) 
fw.write(str.charAt(i));
System.out.println("Writing Successful"); 
fw.close();

int ch; 
FileReader fr=null; 
try{ 
fr = new FileReader("test.txt"); 
} 
catch (FileNotFoundException fe) 
{ System.out.println("File not found"); 
} 


int vowels=0,consonants=0,p=0;
while ((ch=fr.read())!=-1)
{
}

String str1="abcdefghijklmnopqrstuvwxyz";
int len1=str1.length();
int counta=0;
int len2=str.length();
System.out.println("Occurance of characters:");
for(int a=0;a<len1;a++)
{
	counta=0;
	for(int b=0;b<len2;b++)
	{
		if(Character.toLowerCase(str.charAt(a))==Character.toLowerCase(str.charAt(b)))
		{
			counta++;
		}
	}
	System.out.println(str1.charAt(a)+" : "+counta);
}

int count = 0;      
for(int j=0; j<str.length();j++)
	{    
            if(Character.toLowerCase(str.charAt(j)) != ' ')    
            {
              count++;
            }    
            if(Character.toLowerCase(str.charAt(j))== 'a' ||Character.toLowerCase( str.charAt(j)) == 'e' || Character.toLowerCase(str.charAt(j)) == 'i' || Character.toLowerCase(str.charAt(j)) == 'o' || Character.toLowerCase(str.charAt(j)) == 'u') 
			{  
                vowels++;
            }
            else
            {
            consonants++;
            }
}
    int flag=0,wc=0;;
for(int i=0;i<str.length();i++)  
            {  
                 if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') 
                flag = 1;  

		 else if (flag == 1) 
            { 
                flag=0; 
                ++wc; 
            } 
            }   
System.out.println("Total number of characters in a string: " + count);
System.out.println("Total number of vowels in test.txt file is = " +vowels);
System.out.println("Total number of consonants in test.txt file is = " +consonants);
System.out.println("Total number of words in test.txt file is= " +wc);
FileWriter fw1=new FileWriter("test_copy.txt");  
for (int i = 0; i < str.length(); i++) 
fw1.write(str.charAt(i));
System.out.println("Writing successful"); 
fw1.close();
fr.close(); 
} 
}
