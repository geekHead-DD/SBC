package Strings;

import java.util.HashMap;

// Given two strings, write a program to remove characters from the first string which are present in the second string.
public class removestring {
    public static String solve(String str1, String str2) {
        HashMap < Character, Integer > mp = new HashMap < > ();
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str2.length(); i++) {
          mp.put(str2.charAt(i), 1);
        }
        for (int i = 0; i < str1.length(); i++) {
          if (mp.get(str1.charAt(i)) == null)
            ans.append(str1.charAt(i));
        }
        return ans.toString();
      }
    
      public static void main(String args[]) {
        String str1 = "abcdef"; // string 1
        String str2 = "cefz"; // string 2
    
        System.out.println("Final string 1:");
        System.out.println(solve(str1, str2));
      }
}
