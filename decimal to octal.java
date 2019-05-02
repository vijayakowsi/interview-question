program to convert decimal to octal

//Java Program to demonstrate the use of Integer.toOctalString() method  
public class DecimalToOctalExample1{  
public static void main(String args[]){   
System.out.println(Integer.toOctalString(8));  
System.out.println(Integer.toOctalString(19));  
System.out.println(Integer.toOctalString(81));  
}}  

Another method:


import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public  static void getdecimal(long n)
    {
        int c=0;
        int i=0;
        long nn=0;
        long[] dec=new long[20];
        while(n>0)
        {
            nn=n%8;
            dec[i]=nn;
            i++;
            c++;
            n=n/8;
        }
        for(int j=c-1;j>=0;j--)
        {
            System.out.print(dec[j]);
        }
        
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long oct=sc.nextLong();
	    getdecimal(oct);
	    
	   
	}
}
