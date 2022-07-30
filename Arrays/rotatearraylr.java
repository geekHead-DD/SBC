package Arrays;

public class rotatearraylr {
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Function to Rotate k elements to left
    public static void Rotateeletoleft(int[] arr, int n, int k) {
        // Reverse first k elements
        Reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        Reverse(arr, k , n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;
        Rotateeletoleft(arr, n, k);
        System.out.print("After Rotating the k elements to left ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

//    public static void Reverse(int[] arr, int start, int end) {
//        while (start <= end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//    // Function to Rotate k elements to right
//    public static void Rotateeletoright(int[] arr, int n, int k) {
//        // Reverse first n-k elements
//        Reverse(arr, 0, n - k - 1);
//        // Reverse last k elements
//        Reverse(arr, n - k, n - 1);
//        // Reverse whole array
//        Reverse(arr, 0, n - 1);
//    }
//    public static void main(String args[]) {
//        int[] arr = {1,2,3,4,5,6,7};
//        int n = 7;
//        int k = 2;
//        Rotateeletoright(arr, n, k);
//        System.out.print("After Rotating the k elements to right ");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
}


//rotate to left
//public class Rotateeletoleft {
//    public static void main(String[] args)
//    {
//        int arr[] = new int[] { 1,2,3,4,5,6,7 };
//        int n = arr.length;
//        int k = 2; // No. of rotations
//        k = k % n;
//        int i, j;
//        // Reverse first k numbers-> {2,1,3,4,5,6,7}
//        for (i = 0, j = k-1; i < j; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        // Reverse the last n-k terms-> {2,1,7,6,5,4,3}
//        for (i = k, j = n-1; i < j; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        // Reverse the entire array->{3,4,5,6,7,1,2}
//        for (i = 0, j = n - 1; i < j; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//
//        // Print the rotated array
//        for (int t = 0; t < n; t++) {
//            System.out.print(arr[t] + " ");
//        }
//    }
//}
//rotate to right(default)

//public class rotatearray {
//    public static void main(String[] args)
//    {
//        int arr[] = new int[] { 1,2,3,4,5,6,7 };
//        int n = arr.length;
//        int k = 2; // No. of rotations
//        k = k % n;
//        int i, j;
//        // Reverse the first n-k terms-> {5,3,1,11,9,7}
//        for (i = 0, j = n - k - 1; i < j; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        // Reverse last k numbers-> {1,3,5,11,9,7}
//        for (i = n - k, j = n - 1; i < j; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        // Reverse the entire array->{7,9,11,1,3,5}
//        for (i = 0, j = n - 1; i < j; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//
//        // Print the rotated array
//        for (int t = 0; t < n; t++) {
//            System.out.print(arr[t] + " ");
//        }
//    }
//}