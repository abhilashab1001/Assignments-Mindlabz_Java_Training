
public class Q18v
{
		public static void main(String[] args)
		{
		    int a=1;
			for(int i=1;i<=5;i++)
			{
				for(int j=5;j>i;j--)
				{
					System.out.print("");
				}
				for(int k=1;k<=(i*2)-1;k++)
				{
					System.out.print(a);
				}
				a++;
				System.out.println();
			}
		}
}
	