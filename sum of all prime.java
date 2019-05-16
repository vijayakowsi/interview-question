import java.io.*;
import java.util.*;
class GFG
 {
	public static long sievoferas(int n)
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
	            sum+=i;
	        }
	    }
	    return sum;
	    
	}
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     System.out.println(sievoferas(n));
	     
	 }
	 }
}
