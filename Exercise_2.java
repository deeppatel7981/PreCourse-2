// Time Complexity : O(nlogn)
// Space Complexity : O(nlogn) ->
// Did this code successfully run on Leetcode : Couldn't find the problem
// Any problem you faced while coding this : No (Watched online explanations)
class QuickSort
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    void swap(int arr[],int i,int j){
        //Your code here
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    int partition(int arr[], int low, int high) 
    { 
   	    //Write code here for Partition and Swap
        int pivot = arr[high];
        int i = (low - 1); // Index of the smallest element

        for (int j = low; j <= high - 1; j++)
        {
            // If current element is smaller than the pivot
            if  (arr[j] < pivot)
            {
                // Increment the index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    } 
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    {  
            if (low < high)
            {
                int index = partition(arr, low, high);

                sort(arr, low, index-1);
                sort(arr, index+1, high);
            }
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 
