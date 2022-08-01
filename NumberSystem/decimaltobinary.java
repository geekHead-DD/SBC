package NumberSystem;

public class decimaltobinary {
    public static void main(String args[]) {
        int n = 28;
        int flag=0;
        for (int i = 32; i >= 0; i--) {
          int k = n >> i;
          if ((k & 1) > 0) {
              flag=1;
            System.out.print(1);
          } else {
              if(flag==1)
            System.out.print(0);
          }
        }
      }
    // https://takeuforward.org/maths/convert-decimal-to-binary-number/
}
