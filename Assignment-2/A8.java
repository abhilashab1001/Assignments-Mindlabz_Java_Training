//8.Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate & print the average.

import java.util.Scanner;
 class Average{
	int n1,n2,n3;
	int sum=0;
	float avg;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter value for n1:");
		 n1=sc.nextInt();
		System.out.println("Enter value for n2:");
		n2=sc.nextInt();
		System.out.println("Enter value for n1:");
		n3=sc.nextInt();
	}
	void calculate()
	{
		sum=n1+n2+n3;
		avg=sum/3;
		System.out.println("Average:"+avg);
		
	}
}
class A8{
	public static void main(String[] args){
		
	
	Average a1=new Average();
	a1.getData();
	a1.calculate();
	
}

}