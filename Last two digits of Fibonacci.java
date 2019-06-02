Saksham has recently learnt about Fibonacci series, and told his father about it.
His father being a mathematician asked him to tell the Nth number of the Fibonacci series.
But, Saksham told his father that it is difficult to solve the series as he is getting very large numbers.
His father being lenient made his work less and asked to tell only last two digits of the Nth number of Fibonacci series. 
Please help Saksham to find the answer.

Example:
Input:
8
1
2
3
4
5
6
7
8
Output:
1
1
2
3
5
8
13
21

import java.lang.*;
import java.io.*;
class Solution
 {
     public static int[]f= new int[300];
	public static void main (String[] args)
	 {
	 //code
	 Scanner scn = new Scanner(System.in);
	 int t=scn.nextInt();
	 fibonacci();
	 for( int i=0;i<t;i++)
	 {
	     int n=scn.nextInt();
	     
	     System.out.println(fibonacci2(n));
	     
	 }}
	 public static void  fibonacci()
	 {
	     
	     f[0] = 0; 
        f[1] = 1; 
        
        
        for (int i = 2; i < 300; i++) 
            f[i] = (f[i-1] + f[i-2]) % 100; 
	 }
	 public static int  fibonacci2(int n)
	 {
	     if(n>300)
	     {
	         n=n%300;
	     }
	     return f[n]; 
	 }
}
