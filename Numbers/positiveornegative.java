package Numbers;

public class positiveornegative {
    public static void main(String[] args) {

        int n = 5;
        check(n);
        n = -6;
        check(n);
    }

    public static void check(int n) {
        if (n >> 31 == 0) {
            System.out.println(n + " is positive.");
        } else if (n >> 31 == -1) {
            System.out.println(n + " is negative.");
        }
    }
}
//    The signed right shift operator ‘>>’ uses the sign bit to fill the trailing positions. For example, if the number is positive then 0 will be used to fill the trailing positions and if the number is negative then 1 will be used to fill the trailing positions.
//
//    Hence we can say that if a number is positive and we right shift it by 31, then we will get zero, and if the number is negative then we will get -1.
//
//    For eg:  a = 5 ,  b = -6
//
//    a = 0000 0000 0000 0000 0000 0000 0000 0101 = 5
//
//    b = 1111 1111 1111 1111 1111 1111 1111 1010 = -6
//
//    a>>31
//
//    a= 0000 0000 0000 0000 0000 0000 0000 0000 = 0
//
//    b>>31
//
//    b= 1111 1111 1111 1111 1111 1111 1111 1111 = -1

