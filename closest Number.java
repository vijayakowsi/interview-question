Example:
Input:
2
13 4
-15 6
Output:
12
-18


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int closestNumber(int n, int m)
    {
          int q = n / m; // 3
           
        int n1 = m * q;  // 12
           
        int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));
        //52>0?16:8 = 16
           
        if (Math.abs(n - n1) < Math.abs(n - n2))//1<3 
            return n1; //12
           
        return n2;//16     
        }

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0; i<tc; i++)
		{
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    System.out.println(closestNumber(n, m));
		}
	}
}
