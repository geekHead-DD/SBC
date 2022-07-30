package Numbers;

public class gcd {
    static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }
    public static void main(String args[]) {
        int a = 4, b = 8;
        int ans = hcf(a, b);
        System.out.print("The GCD of the two numbers is "+ans);
    }
}


//Using Euclidean’s theorem.
//Intuition: Gcd is the greatest number which is divided by both a and b.If a number is divided by both a and b, it is should be divided by (a-b) and b as well.