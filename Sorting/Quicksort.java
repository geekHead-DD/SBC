package Sorting;

public class Quicksort {
    static int partition(int arr[], int low , int high){
        int pivot = arr[low]  ;
        int i = low ;
        int j = high ;
    
        while (i < j) {
    
          while (arr[i] <= pivot && i <= high - 1) {
            i++  ;
          }
    
          while (arr[j] > pivot && j >= low) {
            j-- ;
          }
    
          if (i < j){
            int t = arr[i]  ; 
            arr[i] = arr[j]  ; 
            arr[j] = t ; 
          }
        }
    
        int t = arr[j]  ; 
        arr[j] = arr[low]  ; 
        arr[low] = t ; 
    
        return j ;
      }
    
      static void quicksort(int arr[] , int low, int high){
        
        if (low < high) {
    
          int pivot = partition(arr, low, high) ;
          quicksort(arr, low, pivot - 1)  ;
          quicksort(arr, pivot + 1, high)  ;
        
        }
    
      }
      public static void main(String[] args) {
        
        int n=8 ; 
        int arr[] = {4, 6, 2, 5, 7, 8, 1, 3}  ; 
        System.out.println("Before Quick Sort: ");
         for(int i=0; i < n ;i++){
          System.out.print(arr[i]+" ")  ; 
        }
        System.out.println();
        quicksort(arr,0,n-1)  ; 
    
        System.out.println("Sorted Array: ") ; 
        for(int i=0; i < n ;i++){
          System.out.print(arr[i]+" ")  ; 
        }
      }
}
// There can be 2 cases :

// Worst Case – This case occurs when pivot is the greatest or smallest element of the array . If partition is done and the last element is pivot , then the worst case would be either increasing order of the array or decreasing order of the array.
// Recurrence:

// F(n) = F(0)+F(n-1)  or  F(n) = F(n-1) + F(0) 

// Worst Case : O(n^2) 

// Best Case – This case occurs when pivot is the middle element of the array. 
//             Recurrence : 

//             F(n) = 2F(n/2) 

//             Best Case : O(nLogn)

// Space Complexity:  O(n)