import java.util.*;
public class Calc {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		Oper op = new Oper(x,y);
		double m = op.multiply();
		System.out.println("The product of the 2 numbers is: "+m);
		op.disp();
	}
}


class Oper{
	double x,y;
	Oper(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	double multiply()
	{
		return x*y;
	}
	void disp()
	{
		System.out.println("The product of the 2 numbers is: "+this.multiply());
	}
}