package Arrays;

public class maximumproductsubarray {
    static int maxProductSubArray(int arr[]) {
        int max = arr[0], min = arr[0], ans = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            // Swapping min and max
            if (arr[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }



            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);


            ans = Math.max(ans, max);
        }

        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,-3,0,-4,-5};
        int answer = maxProductSubArray(nums);
        System.out.println("The maximum product subarray is: "+answer);
    }
}
