import java.util.*;


class SortingTechniques {

    public static void selectionSort(int arr[]){
        /* Time Complexity:
        *   Best Case:    O(n^2)
        *   Average Case: O(n^2)
        *   Worst Case:   O(n^2)
        * 
        * Space Complexity: O(1)
        *   Auxiliary Space: O(1)
        */
        int n = arr.length;
        for(int i =0;i<n;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    public static void bubbleSort(int nums[]){
    /* Time Complexity:
     *   Best Case:    O(n)      // When the array is already sorted
     *   Average Case: O(n^2)
     *   Worst Case:   O(n^2)
     * 
     * Space Complexity: O(1)
     *   Auxiliary Space: O(1)
     */ 
        int n = nums.length;
        for(int i =0;i<n-1;i++){
            boolean swapped = false;
            for(int j =0;j<n-i-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}