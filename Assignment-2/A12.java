/*Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.*/



import java.util.Scanner;

class Employee {
	private String name;
	private float salary, hours;
	
	Employee() {
		name = " ";
		salary = 0;
		hours = 0;
	}
	
	public void getInfo(String n, float sal, float hr) {
		name = n;
		salary = sal;
		hours = hr;
	}
	
	public float AddSal() {
		if(salary<500) {
			salary = salary + 10;
		}
		return salary;
	}
	
	public float AddWork() {
		if(hours > 6) {
			salary = salary + 5;
		}
		return salary;
	}


	
	public void printSal() {
		System.out.println("Salary : " + salary);
}


class TestEmployee {
	
	
	
	}
}

class A12
{
	public static void main (String[] args)
	{
		Employee e1= new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter salary");
		float salary = sc.nextFloat();
		System.out.println("Enter no. of hours of work");
		float hours = sc.nextFloat();
		
		e1.getInfo(name, salary, hours);
		salary = e1.AddSal();
		salary = e1.AddWork();
		
		
		e1.printSal(); 
	}
}