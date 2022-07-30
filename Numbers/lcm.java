package Numbers;

public class lcm {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String args[]) {
        int a = 4, b = 8;
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        System.out.print("The LCM of the two given numbers is "+lcm);
    }
}


//Using Euclidean’s theorem.
//Intuition: Gcd is the greatest number which is divided by both a and b.If a number is divided by both a and b, it is should be divided by (a-b) and b as well.