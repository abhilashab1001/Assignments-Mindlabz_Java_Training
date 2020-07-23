/*4.
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.
*/
  class Triangle{
	 int a,b,c;
	 
	 Triangle(int p,int q,int r){
		a=p;
		b=q;
		c=r;
	}
	 public double getArea(){
		 double s=(a+b+c)/2;
		 return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
	 }
	 public double getParameter(){
		 return(a+b+c)/2.0;
	 }
	 }
	 class A4{
		 public static void main(String[] args){
			 Triangle t=new Triangle(3,4,5);
			
			 System.out.println("Area:"+t.getArea());
			 System.out.println("Parameter:"+t.getParameter());
		 }
	 }
 