import java.util.*;
public class Student {
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int ch=1,a,t=0,j=0;
    	int marks[]=new int[6];
    	String n,u;
    	Stud st[] = new Stud[10];
    	
    	while(ch!=0)
    	{
    		System.out.println("Enter the name,age,marks,usn");
    		n=sc.next();
    		a=sc.nextInt();
    		for(int i=1;i<=5;i++)
    		{
    			marks[i]=sc.nextInt();
    			t = t+marks[i];
    		}
    		u=sc.next();
    		st[j++]=new Stud(n,a,marks,u,t);
    		System.out.println("Enter 0 to end or 1 to continue");
    		ch = sc.nextInt();
    	}
    	Stud.count();
    	
    	for(Stud sp:st)
    	{
    		try{
    			sp.disp150();
    		}
    		catch(Exception e){}
    	}
    	
    	sc.close();
    }
}

class Stud{
	String name,usn;
	int age;
	int marks[] = new int[5];
	int total;
	static int c=0;

	Stud(String n,int a,int[] marks,String u,int t)
	{
		this.name=n;
		this.age=a;
		this.marks=marks;
		this.usn=u;
		this.total=t;
		this.c++;
	}
	
	static void count()
	{
		System.out.println("Total no. of Students: "+c);
	}
	
	void disp150()
	{
		if(this.total>150)
		{
			System.out.println("Name: "+name);
			System.out.println("USN: "+usn);
			System.out.println("Age: "+age);
			for(int i=1;i<=5;i++)
			{
				System.out.println("Marks of Subject"+i+":"+marks[i]);
			}
			System.out.println("Total Marks: "+total);
		}
		else
			System.out.println("Total marks not greater than 150");
	}
	
}