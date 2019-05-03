Given two numbers A and B, find Kth digit from right of AB.

Examples:

Input : a = 3, b = 3, 
        k = 1
Output : 7
Explanation
3^3 = 27 for k = 1. First digit is 7 in 27

Input : a = 5, b = 2, 
        k = 2
Output : 2
Explanation
5^2 = 25 for k = 2. First digit is 2 in 25



/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static long kdigit(int a,int b,int k)
    {
        long p=(long)Math.pow(a,b);
        long rem=0;
        for(int i=1;i<=k;i++)
        {
             rem=p%10;
            p=p/10;
        }
        return rem;
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int a,b,k;
	         a=sc.nextInt();
	         b=sc.nextInt();
	        
	         k=sc.nextInt();
	        
	        long res=kdigit(a,b,k);
	        System.out.println(res);
        }
		//code
	}
}
