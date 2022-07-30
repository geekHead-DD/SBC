package Arrays;
import java.util.*;

public class sortbyfrequency {
    public static void frequencySort(int[] nums)  {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet()); //each individual number in the input array
        Collections.sort(list, (a, b) -> {
            return (map.get(a) == map.get(b))? a-b: map.get(b) - map.get(a);
//            if frequency of two numbers are same, sort by ascending numeric value. If frequencies are not same, sort by descending numeric value
        });


//// function to sort by decreasing frequency
//        Collections.sort(list, (a, b) -> {
//            return (map.get(a) == map.get(b))? b-a: map.get(a) - map.get(b);
// //if frequency of two numbers are same, sort by descending numeric value. If frequencies are not same, sort by increasing numeric value
//        });


        int[] res = new int[nums.length];
        int i = 0;
        for (int num : list) {
            for (int j = 0; j < map.get(num); j++) { //iterate for number of times num is present i.e num's frequency
                res[i++] = num;
            }
        }

        for(int elem:res){
            System.out.print(elem+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3, 3, 5, 2, 1, 1, 2};
        frequencySort(arr);

    }
}

