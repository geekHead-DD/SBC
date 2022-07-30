package Arrays;
import java.util.HashMap;
import java.util.Map;
public class findnonrepeatingelement {
    static void findNonRepeatingElement(int nums[]) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int num:nums) {
            hashMap.put(num,hashMap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> occurence:hashMap.entrySet()) {
            if(occurence.getValue()==1)
                System.out.print(occurence.getKey()+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,-1,1,3,1};
        System.out.println("Non-repeating numbers are: ");
        findNonRepeatingElement(nums);
    }
}

