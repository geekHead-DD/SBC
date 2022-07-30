package Arrays;

//rotate to right(default)
public class rotatearray {
    public static void main(String[] args)
    {
        int arr[] = new int[] { 1,2,3,4,5,6,7 };
        int n = arr.length;
        int k = 2; // No. of rotations
        k = k % n;
        int i, j;
        // Reverse the first n-k terms-> {5,3,1,11,9,7}
        for (i = 0, j = n - k - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse last k numbers-> {1,3,5,11,9,7}
        for (i = n - k, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the entire array->{7,9,11,1,3,5}
        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Print the rotated array
        for (int t = 0; t < n; t++) {
            System.out.print(arr[t] + " ");
        }
    }
}