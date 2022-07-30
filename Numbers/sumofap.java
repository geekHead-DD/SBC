package Numbers;

public class sumofap {
    static double sumofAp(double a, double d, int n)
    {
        double sum = (n / 2.0) * (2.0 * a + (n - 1) * d);
        return sum;
    }
    public static void main(String args[])
    {
        double a = 1.5, d = 3;
        int n = 5;
        System.out.println("Sum of Given Ap Series: "+sumofAp(a, d, n));
    }
}
//    Time Complexity: O(1) since we are using direct formula
//    Space Complexity: O(1) since no extra space is required