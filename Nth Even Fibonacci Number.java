Given a positive integer N, find the Nth Even Fibonacci number.
Since the answer can be very large, print the answer modulo 1000000007.
Example:

Input:
3
1
2
5

Output:

2
8
610

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-- >0)
        {
            int n=in.nextInt();
            long a=2,b=8,temp;
            if(n==1)
            {
                System.out.println(a);
            }
            if(n==2)
            {
                System.out.println(b);
            }
            else
            {
                for(int i=3;i<=n;i++)
                {
                    temp=(a+b*4)%1000000007;
                    a=b;
                    b=temp;
                }
                System.out.println(b);
            }
        }
            
	}
}
