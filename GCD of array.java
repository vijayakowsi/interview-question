
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		if(b==0)
		    return a;
		if(a==b)
		    return a;
		if(a>b)
		    return gcd(a%b,b); 
		else    
		    return gcd(a,b%a);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		  int t = sc.nextInt();
		  
		  while(t-->0)
		  {
		      int n = sc.nextInt();
		      int[] arr = new int[n];
		      for(int i=0;i<n;i++)
		      {
		          arr[i] = sc.nextInt();
		      }
		      
		      int gcd = arr[0];
		      
		      for(int i=2;i<n;i++)
		      {
		          gcd = gcd(arr[i],gcd);
		      }
		      
		      System.out.println(gcd);
		  }
		  sc.close();
	}
}
