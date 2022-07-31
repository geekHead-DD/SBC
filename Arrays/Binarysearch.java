package Arrays;

public class Binarysearch {
    public static void main(String args[]) {
        int arr[] = {6,7,9,5,3,10};
        int n = arr.length;
        int target = 10;
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }
        System.out.print("The element is present in "+ans+" index");
    }
}
// Time Complexity: O(logn).

// Space Complexity: O(1)