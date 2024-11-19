import java.util.Scanner;

interface Payment
{
    void pay(int ammount);
}

class Creditcard implements Payment
{
    Scanner s=new Scanner(System.in);
    String name, exp_date;
    double cardno;

    Creditcard()
    {
        super();

        System.out.println("Holder Name: ");
        this.name=s.nextLine();
        System.out.println("Expire date: ");
        this.exp_date=s.nextLine();
        System.out.println("Card No.: ");
        this.cardno=s.nextDouble();
    }

    public void pay(int ammount)
    {
        System.out.println("paying through creditcard payment:Charging $ "+ammount);
    }
}

class Paypal implements Payment
{
    Paypal()
    {
        super();
        System.out.println("Cheaking the Internet...");
    }
    public void pay(int ammount)
    {
        System.out.println("paying through Paypal payment:Charging $ "+ammount);
    }
}

class Bitcoin implements Payment
{
    Scanner s=new Scanner(System.in);
    String add;

    Bitcoin()
    {
        super();
        System.out.println("Enter the Input Address: ");
        this.add=s.next();
    }

    public void pay(int ammount)
    {
        System.out.println("paying through Paypal payment:Charging $ "+ammount);
    }
}

class Order
{
    private final Payment payment;
    private final int ammount;

    public Order(int ammount,Payment payment)
    {
        this.ammount=ammount;
        this.payment=payment;
    }

    public void Process()
    {
        payment.pay(ammount);
    }
}

public class java11 
{
    public static void main(String args[])
    {
        int ch,amt=0;
        Order or;
        Scanner s=new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the choice: ");
            ch=s.nextInt();
            System.out.println("Enter Ammount: ");
            amt=s.nextInt();

            switch (ch) 
            {
                case 1:
                    or=new Order(amt, new Creditcard());
                    or.Process();
                    break;
                case 2:
                    or=new Order(amt, new Paypal());
                    or.Process();
                    break;
                case 3:
                    or=new Order(amt, new Bitcoin());
                    or.Process();
                    break;
            }
        }
    }
}
