Charlie loves squares. 
So his friend Jack gives him a task to completely fill a rectangle of size AxB using squares of any sizes such that no two squares overlap.
Now charlie wants to use minimum number of squares to complete this task.
He needs help to count minimum number of squares to complete this task. 
The task is to find the minimum number of squares needed to fill the rectangle.

Output:
Print the Output % 1000000007(mudulo)corresponding to each test case in a separate line.

Constraints:
1<=T<=100 
1<=A,B<=10^10

Example:
INPUT:
1
4 5

OUTPUT:
5

EXPLAINATION:
Charlie can fill the rectangle of size 4x5 using one 4x4 square and four 1x1 squares.

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static long square(long m,long n)
    {   long temp;
    long res=0;
    long rem=0;
        if(m < n)
        {
            temp=m;
            m=n;
            n=temp;
        }
        while(n>0)
        {
             res=res+m/n;
             rem=m%n;
             m=n;
             n=rem;
        }
        return res;
        
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        long m=sc.nextLong();
	        long n=sc.nextLong();
	        
	        long res=square(m,n);
	        System.out.println(res % 1000000007); 
	    }
		//code
	}
}
