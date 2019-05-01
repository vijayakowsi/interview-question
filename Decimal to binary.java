

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        System.out.println(Integer.toBinaryString(n));  
	    }
	}
}

Another Method

import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t,n;
	 t=sc.nextInt();
	 while(t-->0)
	 {
	     n=sc.nextInt();
	     int i=0,c=0;
	     int a[]=new int[40];
	     while(n!=0)
	     {
	          a[i]=n%2;
	          i++;
	          c++;
	         n=n/2;
	     }
	     for(i=c-1;i>=0;i--)
	     {
	         System.out.print(a[i]);
	     }
	     System.out.println();
	   
	    
	 }
	 }
}
