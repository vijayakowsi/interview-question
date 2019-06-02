Given coordinates of four points in a plane, find if the four points form a square or not.

Input:
The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. The first line of each test case contains 4 space separated integer points a , b , c , d

Example:
Input:
2
20 20 20 10 10 20 10 10
10 10 10 10 20 10 20 30
Output:
1
0


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		/*Don't assume given coordinates of four points are coordinates of A,B,C & D of square ABCD respectively...Those are random coordinates of four points... 
          Hope it would save ur time...*/
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int x1=sc.nextInt();
		    int y1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y2=sc.nextInt();
		    int x3=sc.nextInt();
		    int y3=sc.nextInt();
		    int x4=sc.nextInt();
		    int y4=sc.nextInt();
		    int[] d=new int[6];
		    d[0]=distance(x1,y1,x2,y2);
		    d[1]=distance(x1,y1,x4,y4);
		    d[2]=distance(x2,y2,x3,y3);
		    d[3]=distance(x3,y3,x4,y4);
		    d[4]=distance(x1,y1,x3,y3);
		    d[5]=distance(x2,y2,x4,y4);
		    
		    Arrays.sort(d);
		    if(d[0]==d[1]&&d[1]==d[2]&&d[2]==d[3]&&d[3]==d[0]&&d[5]==d[4]&&d[5]!=0&&d[4]!=0)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		    t--;
		    
		}
	}
	public static int distance(int a,int b,int c,int d)
	{
	    int dist=(int)Math.sqrt(Math.pow(c-a,2)+Math.pow(d-b,2));
	    return dist;
	    
	}
}
