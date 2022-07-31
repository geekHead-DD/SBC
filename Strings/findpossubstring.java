package Strings;

public class findpossubstring {
    public static void main(String[] args) {
        String text = "takeuforward";
        String pattern = "forward";
     
        int foundIdx = text.indexOf(pattern);
     
        System.out.println("The substring starts from the index: "+foundIdx);
      }
}
