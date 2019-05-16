Print all pairs (sets) of prime numbers (p,q) such that p*q <= n, where n is given number.

Example:
Input:
2
4
8
Output:
2 2
2 2 2 3 3 2


import java.lang.*;
import java.io.*;
class GFG
 {
     int flag=0;
	public static void main (String[] args)
	 {
	  Scanner sc= new Scanner(System.in);
	  int t= sc.nextInt();
	  while(t-->0)
	  {
	      
	      int n=sc.nextInt();
	     
	      fun(n); 
	      System.out.println();
	    
	  }
	 }
	 public static void fun(int n)
	 {
	     for(int i=2;i<=n;i++)
	     {
	         int pCheck=checkPrime( i);
	         for(int j=2;j<=n;j++)
	         {
	             if((i*j)<=n)
	             {
	               
	                int qCheck=checkPrime( j);
	                if(pCheck==0&&qCheck==0)
	                {
	                    System.out.print(i+" "+j+" ");
	                    
	                }
	             }
	         }
	     }
	 }
	 
	 public static int checkPrime(int c)
	 {
	     
	     for(int i=2;i<=c/2;i++)
	     {
	         if(c%i==0&&c!=2)
	         {
	             return  1;
	         }
	     }
	     return 0;
	 }
}
