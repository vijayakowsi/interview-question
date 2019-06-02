Given a MxN matrix, count the number of squares in the matrix.squaresinREct


The first line of input contains an integer T denoting the no of test cases. 
Then T test cases follow. Each test case contains two space seperated integers M and N, denoting the size of the Matrix.

Input:

2
2 2
4 3

Output:

5
20

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static long square(long m,long n)
    {
        long temp;
        if(m > n)
        {
          
            temp=m;
            m=n;
            n=temp;
        }
        return m * (m + 1) * (2 * m + 1) /  
        6 + (n - m) * m * (m + 1) / 2; 
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        long m=sc.nextLong();
	        long n=sc.nextLong();
	        
	        long res=square(m,n);
	        System.out.println(res); 
	    }
		//code
	}
}
