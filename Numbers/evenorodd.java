package Numbers;

public class evenorodd {
    public static void main(String[] args) {

        int n = 5;
        if (solve(n) == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
    public static int solve(int n) {
        if ((n & 1) == 0)
            return 0;
        else
            return 1;
    }
//    Even Number: The last bit of even number is always 0.
//
//    Odd Number: Last bit of the odd number is always 1.
//
//    If we can get the last bit of any number then we can say that it is even or odd.
//
//    Approach:
//
//    Take AND of n with 1.
//    If it is 0 then print even otherwise odd.
}
