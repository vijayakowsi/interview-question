Given two rectangles, find if the given two rectangles overlap or not.
A rectangle is denoted by providing the x and y co-ordinates of two points:
the left top corner and the right bottom corner of the rectangle.
Two rectangles sharing a side are considered overlapping.

Example:
Input:
2
0 10 10 0
5 5 15 0
0 2 1 1
-2 -3 0 2

Output:
1
0


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x4 = sc.nextInt();
            int y4 = sc.nextInt();
            
            // System.out.println(x1+" "+y1+" "+x2+" "+y2); 
            // System.out.println(x3+" "+y3+" "+x4+" "+y4);
            if(x1>x4 || x3>x2)
                System.out.println("0");
            else if (y4>y1 || y2>y3)
                System.out.println("0");
            else
                System.out.println("1");
        }
	}
}
