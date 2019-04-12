import java.util.*;
public class MainClass {
    static Scanner sc=new Scanner(System.in);
    static LinkedList<MissedCall> amiss;
    static void HandleCalls() {
        amiss=new LinkedList<MissedCall>();

        while(true) {
            System.out.println("1:Add missed calls  2:Delete while display  3:Delete specified number  4:Display all");
            int ch=sc.nextInt();
            
            switch(ch) {
            
            case 1: Calendar calobj=Calendar.getInstance();
		            System.out.println("Enter phone number");
		            int num = sc.nextInt();
		            String mname;
		            if(CallData.hm.containsKey(num))
		                mname=CallData.hm.get(num);
		            else
		                mname="Private Caller";
		            MissedCall m= new MissedCall(calobj,mname,num);
		            if(amiss.size()==10)
		                amiss.removeFirst();
		            amiss.add(m);
		            System.out.println(m.name+" added to the records");
		            break;
		            
            case 2: ListIterator<MissedCall> it = amiss.listIterator();
		            LinkedList<MissedCall> miss = new LinkedList<MissedCall>();
		            int i=0;
		            while(it.hasNext()) {
		                i++;
		                MissedCall m1=it.next();
		                System.out.println("What do you want to do with this "+m1.number+" record");
		                System.out.println("1:Delete Record  2:Next Record  3:Display Record");
		                int ch2=sc.nextInt();
		                if(ch2==1)
		                    miss.add(m1);
		                else if(ch2==3)
		                    m1.display();
		            }
		            if(i!=0)
		            	amiss.removeAll(miss);
		            else
		                System.out.println("No missed calls");
		            break;
            
            case 3: ListIterator<MissedCall> it2= amiss.listIterator();
		            LinkedList<MissedCall> miss2 = new LinkedList<MissedCall>();
		            System.out.println("Enter phone number to delete");
		            int telno=sc.nextInt();
		            int flag=0;
		            i=0;
		            while(it2.hasNext()) {
		                i++;
		                MissedCall m3= it2.next();
		                if(m3.number==telno) {
		                    flag=1;
		                    miss2.add(m3);
		                    break;
		                }
		            }
		            if(i>0) {
		                if(flag==1) {
		                	
		                    amiss.removeAll(miss2);
		                    System.out.println("Phone number record removed");
		                }
		                else
		                    System.out.println("Phone number record does not exist");
		            }
		            else
		                System.out.println("No missed calls");
		            break;
		            
            case 4: ListIterator<MissedCall> it4=amiss.listIterator();
		            while(it4.hasNext())
		            {
		                MissedCall m1=it4.next();
		                m1.display();
		            }
		            break;
		            
            default: return;  
            }
        }
    }
    
    public static void main(String[] args) {
        CallData.acceptnumber();
        System.out.println("Receive missed calls");
        HandleCalls();
        CallData.display();
    }

}

class MissedCall {
	Calendar calobj;
	String name;
	int number;
	MissedCall(Calendar co,String n ,int num){
	    calobj=co;
	    name=n;
	    number=num;
	}
	void display() {
	    System.out.println(calobj.getTime());
	    System.out.println(name);
	    System.out.println(number);
	}
}

class CallData {
    public static HashMap<Integer,String> hm;
    public static Scanner sc=new Scanner(System.in);
    public static void  create(int n) {
        hm=new HashMap<Integer,String>();
        for(int i=0;i<n;i++) {
            System.out.println("Enter phone number and name");
            Integer num= sc.nextInt();
            String name=sc.next();
            hm.put(num, name);
        }
    }
    public static void acceptnumber() {
        System.out.println("Enter number of contacts");
        int n=sc.nextInt();
        create(n);
    }
    
    public static void display() {
        Set<Map.Entry<Integer, String>> hashset = hm.entrySet();
        for(Map.Entry<Integer, String>c:hashset) {
            System.out.println("number"+c.getKey()+"\n"+"name"+c.getValue());
        }
    }
    
}

