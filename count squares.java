Given a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. 
You are given a number N, you have to print the number of integers less than N in the sample space S.

Example
Input :
2
9
3

Output :
2
1

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
	       int i;
	       int count=0;
	       int n=sc.nextInt();
	       for(i=1;i*i<n;i++)
	      {
	 
	            count++;
	        
	      }
	    System.out.println(count);
	   }
	}
}
