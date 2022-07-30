package Numbers;

public class sumofnnaturalnumbers {
    public static void main(String[] args) {

        solve(5);
        solve(6);
    }
    public static void solve(int N) {
        int sum = N * (N + 1) / 2;
        System.out.println("The sum of the first " + N + " numbers is: " + sum);
    }
}
//    Time Complexity: O(1)
//
//    Space Complexity: O(1)