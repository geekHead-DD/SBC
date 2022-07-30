package Numbers;

public class suminrange {
    public static void main(String args[]) {
        int l = 2, r = 7;
        //sum(1 to r) - sum(1 to l-1)
        int ans = (r * (r + 1)) / 2 - ((l) * (l-1)) / 2;
        System.out.print("The sum of the numbers in the given range is "+ans);
    }
    //Intuition: Find the sum of numbers from 1 to r and then subtract the sum of numbers from 1 to l-1 to get the sum of elements from l to r.
}
