using userdefined function:


import java.util.*;
import java.lang.*;
import java.io.*;

public class practice {
	public static void main (String[] args) {
		//code
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t>0){
		    int a = input.nextInt();
		    System.out.println((int)Math.floor(Math.cbrt(a)));
		    t--;
		}
		input.close();
	}
}

without usong userdefined function:


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner src = new Scanner(System.in);
		int t = src.nextInt();
		for(int i = 0; i < t; i++){
		    double n = src.nextDouble();
		    System.out.println(cubicRoot(n));
		}
	}
	
	private static long cubicRoot(double n) {
	    // Set start and end for binary search 
        double start = 0, end = n;
        
        // Set precision 
        double e = 0.0000001; 
        
        while (true) 
        { 
            double mid = (start + end)/2; 
            double error = Math.abs(n-(mid*mid*mid));
   
            // If error is less than e then mid is 
            // our answer so return mid 
            if (error <= e) 
                return (long)Math.floor(mid); 
   
            // If mid*mid*mid is greater than n set 
            // end = mid 
            if ((mid*mid*mid) > n) 
                end = mid; 
   
            // If mid*mid*mid is less than n set 
            // start = mid 
            else
                start = mid; 
        } 
	}
}
