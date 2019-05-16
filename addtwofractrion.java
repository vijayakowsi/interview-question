Example:
Input
1
1 500 2 500
Output
3/500

Explanation:
In above test case 1/500+2/500=3/500

class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here	
    int den = lcm(den1, den2);
    int num = num1 * den/den1 + num2 * den/den2;
    int gcd = gcd(num, den);
System.out.println(num/gcd + "/" + den/gcd);
}

int gcd(int a, int b) {
if(a == b || a == 0) return b;
if(b == 0) return a;

return a > b ? gcd(a%b, b) : gcd(a, b%a);
}

int lcm(int a, int b) {
return a * b / gcd(a, b);
}
}
