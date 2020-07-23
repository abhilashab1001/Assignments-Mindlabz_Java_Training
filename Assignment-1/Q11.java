//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.Scanner;


public class Q11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int number,countpos = 0,countneg = 0,countzero = 0;           
        char choice;
	
        do
        {
            System.out.print("Enter the number ");
            number = sc.nextInt();
        
            if(number > 0)
            {
                countpos++;
            }
            else if(number < 0)
            {
                countneg++;
            }
            else
            {
                countzero++;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Positive numbers: " + countpos);
        System.out.println("Negative numbers: " + countneg);
        System.out.println("Zero numbers: " + countzero);
    }  
}
