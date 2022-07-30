package Arrays;
import java.util.*;

public class countfrequency {

    public static void main(String args[]){

        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        Frequency(arr, n);
    }
    static void Frequency(int arr[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> keys : map.entrySet())
        {
            System.out.println(keys.getKey() + " " + keys.getValue());
        }
    }
}

//import java.util.*;
//
//public class tuf {
//
//    public static void main(String args[]){
//
//        int arr[] ={10,5,10,15,10,5};
//        int n = arr.length;
//        countFreq(arr, n);
//    }
//    public static void countFreq(int arr[], int n)
//    {
//        boolean visited[] = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//
//            // Skip this element if already processed
//            if (visited[i] == true)
//                continue;
//
//            // Count frequency
//            int count = 1;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    visited[j] = true;
//                    count++;
//                }
//            }
//            System.out.println(arr[i] + " " + count);
//        }
//    }
//}