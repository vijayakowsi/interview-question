Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a3 + b3 = N.
Example:
Input:
2
9
28

Output:
2
2


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
		    int n=sc.nextInt();
		    int a,b;
		    int count=0;
		    for(a=1;a<=Math.cbrt(n);a++)
		    {
		        for(b=0;b<Math.cbrt(n);b++)
		        {
		            if((int)(Math.pow(a,3)+Math.pow(b,3))==n)
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
