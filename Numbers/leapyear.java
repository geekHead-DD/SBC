package Numbers;

public class leapyear {
    public static void main(String args[]) {
        int year = 1992;
        if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
