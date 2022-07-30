package Arrays;
import java.util.*;
public class removeduplicatesunsortedarray {
    static void duplicate(int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                mp.put(arr[i], 1);
            }
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };

        duplicate(arr, n);
    }
}



//import java.util.*;
//class removeduplicatesunsortedarray {
//
//    public static int[] duplicate(int A[], int N)
//    {
//        LinkedHashSet<Integer> set =new LinkedHashSet<>();
//        for(int elem:A){
//            set.add(elem);
//        }
//        int output[]=new int[set.size()];
//        int c=0;
//        for(int element:set){
//            output[c]=element;
//            c++;
//        }
//        return output;
//    }
//        public static void main(String[] args) {
//        int n = 9;
//        int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
//
//        duplicate(arr, n);
//    }
//}