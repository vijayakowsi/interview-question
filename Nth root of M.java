
Example:
Input:
2
2 9
3 9
Output:
3
-1

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int flag=1;
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    for(int i=1;i<=Math.sqrt(m);i++)
		    {
		        if(Math.pow(i,n)==m)
		        {
		            System.out.println(i);
		            flag=0;
		            break;
		        }
		    }
		    if(flag==1)
		    {
		        System.out.println("-1");
		    }
		}
	}
}
