Find nCr for given n and r.

Example:
Input:
2
3 2
4 2
Output:
3
6


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int r = sc.nextInt();
	        long[][] dp = new long[n+1][r+1];
	       
	       for(int i=1;i<= n;i++){
	           for(int j=0;j<=Math.min(i,r);j++){
	               if(j==0 || i==j)
	                    dp[i][j] = 1;
	                else
	                    dp[i][j] = (dp[i-1][j-1]+dp[i-1][j])%(1000000007);
	           }
	       }
	        System.out.println(dp[n][r]);
	    }
	}
}
