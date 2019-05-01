
Given a Binary Number B, Print its decimal equivalent.

Example:
Input:
2
10001000
101100
Output:
136
44

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	   
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	         long n,nn;

	         int c=0;
	       long sum =0;
	       n=sc.nextLong();
	       while(n>0)
	       {
	           nn=n%10;
	           if(nn>0)
	           {
	           sum=sum+(long)Math.pow(2,c);
	           
	           }
	           n=n/10;
	           c++;
	       }
	       System.out.println(sum);
	    }
		
	}
}
