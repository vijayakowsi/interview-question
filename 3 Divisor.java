Given a value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

Example:
Input :
3
6
10
30

Output :
1
2
3

import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
         
	
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int i = 1; i <= T; i++)
		{
			int n = scanner.nextInt();
			
			boolean primes[] = new boolean[ n + 1 ];
			

			for( int m = 0 ; m <=n; m++)
			{
				primes[ m ] = true;
			}
			
			
			primes[ 0 ] = false;
			
			primes[ 1 ] = false;
			
			
			for( int m = 2 ; m <= Math.sqrt(n); m++)
			{
				for( int j = 2; j * m <= n ; j++ )
				{
					primes[m*j] = false;
				}
			}
			
			int count = 0;
			for( int m = 2 ; m < n ; m++)
			{
				int threeDivisors = (int) Math.pow(m, 2);
				
				if( primes[ m ] && threeDivisors <= n )
					count++;
			}
		System.out.println(count);
	 
	 }
	 }
}
