package Numbers;

public class maxmindigit {
    static private void MinMax(int n)
    {
        int d;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        while (n != 0)
        {
            d = n % 10;
            mini = Math.min(mini,d);
            maxi = Math.max(maxi,d);
            n = n / 10;
        }

        System.out.println("The minimum digit is: "+mini);
        System.out.print("The maximum digit is: "+maxi);
    }
    public static void main(String[] args)
    {
        int n = 4726;
        MinMax(n);
    }
}
