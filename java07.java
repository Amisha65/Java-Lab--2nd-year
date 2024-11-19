import java.lang.*; 
import java.io.*;
import java.util.*;

class java07 
{
    public static void main(String args[])
    {
        Integer iarray[]={55,44,12,16};
        
        count("Even",iarray);
        count("Odd",iarray);
        count("Palimdrome",iarray);
        count("Prime",iarray);
    }


    static<T>void count(String type,T[] element)
    {
        int even=0;
        int odd=0;
        int palindrome=0;
        int prime=0;
    
        if(type.equals("Even"))
        {
            for(T value:element)
            {
                if(Integer.parseInt(value.toString())%2==0)
                {
                    even++;
                }
            }
            System.out.println("Even: "+even);
        }

        if(type.equals("Odd"))
        {
            for(T value:element)
            {
                if(Integer.parseInt(value.toString())%2!=0)
                {
                    odd++;
                }
            }
            System.out.println("Odd: "+odd);
        }
    
        if(type.equals("Palimdrome"))
        {
            for(T value:element)
            {
                StringBuffer rev=new StringBuffer(new String(value.toString()));
                if(value.toString().equals(new String(rev.reverse())))
                {
                    palindrome++;
                }
            }
            System.out.println("Palindrome: "+palindrome);
        }
    
        if(type.equals("Prime"))
        {
            for(T value:element)
            {
                if(isprime(Integer.parseInt(value.toString())))
                {
                    prime++;
                }
            }
            System.out.println("Prime: "+prime);}
        }

        static boolean isprime(int num)
        {
            int flag=0;
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        
        }
    }








