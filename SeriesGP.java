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
	        Double a=sc.nextDouble();
	        Double b=sc.nextDouble();
	        int n=sc.nextInt();
	        
	        int res=(int)(a*Math.pow((b/a),n-1));
	        System.out.println(res);
	    }
		//code
	}
}
