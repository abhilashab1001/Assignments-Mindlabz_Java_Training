/*Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/
public class Q13
{
    public static void main(String[] args)
    {
        int d1,d2,d3;
	for(int number = 1; number <= 500; number++)
	{
            int temp = number;
	    d1 = temp % 10;

            temp = temp / 10;
            d2 = temp % 10;
            
            temp = temp / 10;
            d3 = temp % 10;

	    if(d1*d1*d1 + d2*d2*d2 + d3*d3*d3 == number)
            {
	        System.out.println(number);
            }
	}
    }  
}
