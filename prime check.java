/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n;
	        int flag=0;
	        n=sc.nextInt();
	        for(int i=2;i<n/2+1;i++)
	        {
	            if(n%i==0)
	            {
	                flag=0;
	                break;
	            }
	            else
	            {
	                flag=1;
	            }
	        }
	        if(flag==1)
	        {
	            System.out.println("Yes");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	    }
		//code
	}
}
