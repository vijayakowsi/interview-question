
Example:
Input:
2
10
35
Output:
2 3 5 7
2 3 5 7 11 13 17 19 23 29 31 


import java.util.*;
class GFG
 {
	public static void sievoferas(int n)
	{
	    boolean prime[]=new boolean[n+1];
	    for(int i=0;i<=n;i++)
	    {
	        prime[i]=true;
	    }
	    
	    for(int j=2;j*j<=n;j++)
	    {if(prime[j]==true)
	    {
	        for(int i=j*j;i<=n;i+=j)
	        {
	            prime[i]=false;
	        }
	    }
	    }
	    long sum=0;
	    
	    for(int i=2;i<=n;i++)
	    {
	        if(prime[i]==true)
	        {
	            System.out.print(i+" ");
	        }
	    }
	    System.out.println("");
	    
	    
	}
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     sievoferas(n);
	     
	 }
	 }
}
