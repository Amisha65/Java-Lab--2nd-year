import java.util.Scanner;

class Employee
{
    String name;
    int id;
    String address;
    long mob_no;
    double DA,BP,HRA,PF,SCF,Grosspay,netpay;
    
    Employee()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        name=s.nextLine();
        System.out.println("Enter ID: ");
        id=s.nextInt();
        System.out.println("Enter Address: ");
        address=s.nextLine();
        System.out.println("Enter Mobile No.: ");
        mob_no=s.nextInt();
    }
    void display()
    {
        System.out.println("Name: "+name+ "\nID: "+id+ "\nAddress: "+address+ "\nMobile No.: "+mob_no);
        DA=97*BP;
        HRA=10*BP;
        PF=12*BP;
        SCF=0.1*BP;
        
        Grosspay=(DA+HRA+PF);
        netpay=Grosspay-(PF+SCF);
        
        System.out.println("Grosspay: "+Grosspay+ "\nNeypay: "+netpay);
        
    }
}

class programmer extends Employee
{
    programmer()
    {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the basic pay: ");
        BP=p.nextDouble();
    }
    void diplay()
    {
        super.display();
    }
}

class team_lead extends Employee
{
    team_lead()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Basic pay: ");
        BP=s.nextDouble();
    }
    void display()
    {
        super.display();
    }
}

class assistant extends Employee
{
    assistant()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the BAsic pay: ");
        BP=s.nextDouble();
    }
    void display()
    {
        super.display();
    }
}

class project_manager extends Employee
{
    project_manager()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the BAsic pay: ");
        BP=s.nextDouble();
    }
    void display()
    {
        super.display();
    }
}


public class java01
{
	public static void main(String[] args) 
	{
		
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee Type: ");
		String type=s.nextLine();
		
		if(type.equals("Programmer"))
		{
		    programmer p=new programmer();
		    p.display();
		}
		else if(type.equals("team leader"))
		{
		    team_lead t=new team_lead();
		    t.display();
		}
		else if(type.equals("assistant"))
		{
		    assistant a=new assistant();
		    a.display();
		}
		else
	    {
	        project_manager p=new project_manager();
	        p.display();
	    }
	}
}
