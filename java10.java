import java.util.Scanner;
// import java.io.*;

abstract class car_factory
{
    String car_name,company_name;
    double budget;

    abstract void setprice(double price);
    abstract void details(String car_name, String company_name);
    abstract void accesories();

    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Campany name: ");
        company_name=s.nextLine();

        System.out.println("Car name: ");
        car_name=s.nextLine();

        System.out.println("Budget: ");
        budget=s.nextDouble();
    }

    void display(car_factory obj1)
    {
        obj1.setprice(budget);
        obj1.details(company_name,car_name);
        obj1.accesories();
    }
}

class Small_car extends car_factory
{
    String ans;
    public void setprice(double price)
    {
        if(price>2 && price<5)
        {
            ans="NO";
        }
        else
        {
            ans="Yes";
        }
    }

    public void details(String car_name,String company_name)
    {
        System.out.println("Campany name: "+company_name);
        System.out.println("Car name: "+car_name);
        System.out.println(":Colour: black/white ");
        System.out.println("Fule :Petrol ");
    }

    public void accesories()
    {
        System.out.println("Types of Tyres: Alloy wheels");
        System.out.println("Airbags: "+ans);
        System.out.println("Back wiper: yes ");
        System.out.println("Side Mirror: Yes");
        System.out.println("Touch Scrren Music player: "+ans);
    }
}

public class java10 
{
    public static void main(String args[])
    {
        int ch;
        Scanner s=new Scanner(System.in);
        ch=s.nextInt();
        car_factory obj1;

        while(true)
        {
            switch(ch)
            {
                case 1:
                    obj1=new Small_car();
                    obj1.input();
                    obj1.display(obj1);
                    break;
            }
        }
    }
}
