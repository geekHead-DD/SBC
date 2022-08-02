package Sorting;

public class selectionsort {
    public static void main(String args[]) {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
        //selection sort
        for (int i = 0; i < n - 1; i++) {
          int mini = i;
          for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[i]) {
              mini = j;
            }
          }
          //swap
          int temp = arr[mini];
          arr[mini] = arr[i];
          arr[i] = temp;
        }
    
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
}
// Time Complexity: O(n^2) (nested for loops)

// Space Complexity: O(1)