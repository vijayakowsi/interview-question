
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static long gcd(long a,long b)
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
		      long a = sc.nextLong();
		      long b = sc.nextLong();
		      
		      System.out.println((a*b)/gcd(a,b)+" "+gcd(a,b));
		  }
		 
	}
}
