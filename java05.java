
import java.util.Scanner;

interface Vehicle
{
    void gearchange(int g);
    void speedup(int s);
    void applybreak(int a);
}

class Bicycle implements Vehicle
{
    int bgear,bspeed;
    public void gearchange(int newgear)
    {
        bgear=newgear;
    }
    public void speedup(int increment)
    {
        bspeed=bspeed+increment;
    }
    public void applybreak(int decrement)
    {
        bspeed=bspeed-decrement;
    }
    void display()
    {
        System.out.println("Speed: "+bspeed+ "\nGear: "+bgear);
    }
}

class java05 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Newgear, Newspeed, Applygear: ");
        int gear=s.nextInt();
        int speed=s.nextInt();
        int breakk=s.nextInt();
        
        Bicycle b=new Bicycle();
        b.gearchange(gear);
        b.speedup(speed);
        b.applybreak(breakk);
        b.display();
    }
}





