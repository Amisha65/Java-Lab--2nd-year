import java.util.Scanner;

public class java06 
{
    public static void main(String args[])
    {
        int num1,num2,res;
        int iarray[]={2,3,4};

        try
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the values for Divide: ");
            num1=Integer.parseInt(s.next());
            num2=s.nextInt();
            res=num1/num2;
            System.out.println("Divition: "+res);

            for(int i=0;i>=0;i++)
            {
                System.out.println("["+i+"]: "+ iarray[i]);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
