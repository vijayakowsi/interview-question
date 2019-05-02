program for octal to decimal conversion

For Example:
If the octal number is 67.
dec_value = 6*(8^1) + 7*(8^0) = 55




import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public  static long getoctal(long n)
    {
        int c=0;
        long nn=0;
        long sum=0;
        while(n>0)
        {
            nn=n%10;
            sum +=nn*(long)Math.pow(8,c);
            c++;
            n=n/10;
        }
        return sum;
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long dec=sc.nextLong();
	    long result=getoctal(dec);
	    System.out.println(result);
	   
	}
}
