Given a number N find the sum of all the even valued terms in the fibonacci sequence less than or equal to N.
The first few terms of Fibonacci Numbers are, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ,… (Even numbers are highlighted).
Example:
Input:
2
8
400

Output:
10
188


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static long fibo(long limit)
    {
        if(limit < 2)
        {
            return 0;
        }
        long ef1=0;
        long ef2=2;
        long ef3;
        long sum=ef1+ef2;
        while(ef2<=limit)
        {
            ef3=4*ef2+ef1;
            if(ef3 >limit)
            {
                break;
            }
            ef1=ef2;
            ef2=ef3;
            sum=sum+ef3;
        }
        return sum;
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long limit=sc.nextLong();
		    System.out.println(fibo(limit));
		}
	}
}
