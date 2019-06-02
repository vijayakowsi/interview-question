

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
		    double h=sc.nextDouble();
		   double m=sc.nextDouble();
		    
		    if(h==12)
        {
            h=0;
        }
        if(m==60)
        {
            m=0;
        }
        double hrangle=(0.5*(h*60+m));
        double mangle=(6*m);
        double angle=Math.abs(hrangle - mangle);
        angle=Math.min(Math.abs(360-angle),angle);
        System.out.println((int)angle);
		    
		}
	}
}
