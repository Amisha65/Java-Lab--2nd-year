
import java.util.Scanner;

abstract class shape
{
    double width,depth;
    abstract public void calcutearea();
}

class Traingle extends shape
{
    public void calcutearea()
    {
        System.out.println("Area of the trainglr: "+ (width*depth));
    }
}

class Reactangle extends shape
{
    public void calcutearea()
    {
        System.out.println("Area od reactangle: "+(0.5*width*depth));
    }
}

class java02
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Area of Traingle");
        System.out.println("Enter Depth and width: ");
        shape t=new Traingle();
        t.width=s.nextDouble();
        t.depth=s.nextDouble();
        t.calcutearea();
        
        System.out.println("Area of the Reactangle");
        System.out.println("Enter the width and depthe: ");
        shape r=new Reactangle();
        r.depth=s.nextDouble();
        r.width=s.nextDouble();
        r.calcutearea();
    }
}






