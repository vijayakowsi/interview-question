
Example:
Input:
2
6
21
Output:
1
0

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long n=sc.nextLong();
		    long sum=1;
		    for(long i=2;i<Math.sqrt(n);i++)
		    {
		        if(n%i==0)
		        {
		            sum=sum+i+n/i;
		        }
		    }
		    if(sum==n)
		    {
		        System.out.println('1');
		    }
		    else
		    {
		        System.out.println('0');
		    }
		}
	}
}
