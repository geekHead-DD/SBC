package Arrays;

import java.util.HashMap;
import java.util.Map;

public class findrepeatingelement {
    static void findRepeatingElements(int arr[]) {
        HashMap<Integer,Integer> elementCount = new HashMap<>();

        for(int num:arr) {
            elementCount.put(num, elementCount.getOrDefault(num, 0)+1);
        }
        System.out.print("The repeating elements are: ");
        for(Map.Entry<Integer, Integer> occurence : elementCount.entrySet()) { //returns key value pair, get key- .getKey(), get value- .getValue()
            if(occurence.getValue()>1)
                System.out.print(occurence.getKey()+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        findRepeatingElements(arr);
    }
}

