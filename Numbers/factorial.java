package Numbers;

public class factorial {
    static int fact(int X) {
        if (X == 0) {
            return 1;
        }
        return X * fact(X - 1);
    }
    public static void main(String[] args) {

        int X = 5;
        int result = fact(X);
        System.out.println("The factorial of " + X + " is " + result);
    }
}
