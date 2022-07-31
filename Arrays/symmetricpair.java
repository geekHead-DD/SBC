package Arrays;

import java.util.HashMap;
public class symmetricpair {
    public static void main(String args[]) {

        int arr[][] = {{1, 2}, {2, 1}, {4, 5},{3, 4}, {5, 4}};

        HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
        System.out.println("The Symmetric Pairs are: ");
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];      
            int second = arr[i][1];   
            if (mp.get(second) != null && mp.get(second) == first) { 
                System.out.println("("+first + " " + second+") ");
            } else {
                mp.put(first, second); 
            }
        }

    }
}
//<key-1,value-2>
//<key-2,value-1> mp.get(1(second))->returns value 2 which is equal to current first(2), hence symmetric
//<key-4,value-5>
//<key-3,value-4>
//<key-5,value-4>