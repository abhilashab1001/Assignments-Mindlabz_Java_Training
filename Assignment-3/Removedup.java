/*11) How to remove duplicate characters from String?
For example, if the input is ‘bananas’ the output will be ‘bans’.*/
import java.util.Scanner;
public class Removedup
{
public static void main(String[] args)
 {

    int i,j;
    StringBuffer str=new StringBuffer();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");

    str.append(sc.nextLine());

    for (i=0;i<str.length()-1;i++)
    {
        for (j=1;j<str.length();j++)
        {
            if (str.charAt(i)==str.charAt(j))
                str.deleteCharAt(j);
        }
    }
    System.out.println(" Outout: " + str);
}
}