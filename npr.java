/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static long fact(long x)
    {
        if(x==0)
            return 1;
        return x * fact(x-1);
    }
    public static long permutation(long n,long r)
    {
        long x=n-r;
        return fact(n)/fact(x);
        
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        long n=sc.nextLong();
	        long r=sc.nextLong();
	        long res=permutation(n,r);
	        System.out.println(res);
	    }
		//code
	}
}
