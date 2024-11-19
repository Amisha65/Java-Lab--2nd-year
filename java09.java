import java.util.Scanner;
import java.util.*;

public class java09
{
    public static void main(String args[])
    {
        int ch;
        Scanner s=new Scanner(System.in);
        savingAccount a;
        bank bm=new bank();
        do
        {
            System.out.println("***MENU*** \n1.Create Account \n2.displayAccount \n3.checkbal \n4.withdrawAmmont \n5.diposite");
            System.out.print("Enter the Choice: ");
            ch=s.nextInt();

            switch (ch) 
            {
                case 1:
                    a=bm.createAccount();
                    break;
                // case 2:
                //     bm.displayAccount();
                //     break;
                // case 3:
                //     bm.checkbal();
                //     break;
                case 2:
                    bm.withdrawAmmont();
                    break;
                // case 5:
                //     System.out.println("Enter Amount for Diposite: ");
                //     double amount=s.nextDouble();
                //     bm.diposite(amount);
                //    break;
            }
        }while(ch<6);
    }
}

class customer
{
    String name;
    int age;

    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }

    public void setage(int age)
    {
        this.age=age;
    }
    public int getage()
    {
        return age;
    }
}

abstract class Account
{
    protected double balance;
    protected int AccID;
    protected String Acctype;
    protected customer custobj;

    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    public double getbalance()
    {
        return balance;
    }

    public void setAccID(int AccID)
    {
        this.AccID=AccID;
    }
    public int getAccID()
    {
        return AccID;
    }

    public void setAcctype(String Acctype)
    {
        this.Acctype=Acctype;
    }
    public String Acctype()
    {
        return Acctype;
    }

    public void setcustobj(customer custobj)
    {
        this.custobj=custobj;
    }
    public customer getcustobj()
    {
        return custobj;
    }

    public abstract boolean withdraw(double amount);
}

class savingAccount extends Account
{
    double minbal;
    public void setminbal(double minbal)
    {
        this.minbal=minbal;
    }
    public double getminbal()
    {
        return minbal;
    }

    public boolean withdraw(double amount)
    {
        if((balance-amount)>minbal)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class bank
{
    static Scanner s=new Scanner(System.in);
    savingAccount a=new savingAccount();
    customer c=new customer();

    public savingAccount createAccount()
    {
        System.out.print("Name: ");
        String name=s.nextLine();
        c.setname(name);

        System.out.print("Age: ");
        int age=s.nextInt();
        c.setage(age);

        System.out.print("Balance: ");
        double balance=s.nextDouble();
        a.setbalance(balance);

        System.out.print("Account ID: ");
        int AccID=s.nextInt();
        a.setAccID(AccID);

        System.out.print("Account Type: ");
        String Acctype=s.nextLine();
        a.setAcctype(Acctype);
        a.setcustobj(c);

        System.out.println("Minimum Balance: ");
        double minbal=s.nextInt();
        a.setminbal(minbal);

        return a;
    }
    
    void withdrawAmmont()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Amount to withdraw: ");
        double amt=s.nextDouble();

        if(a.withdraw(amt)==true)
        {
            System.out.println("Succesfule "+a.getbalance());
        }
        else
        {
            System.out.println("Not that Money Avai ");
        }
    }
}