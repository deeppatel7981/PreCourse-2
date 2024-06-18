// Time Complexity : O(logn)
// Space Complexity : O(1) -> No ds was used for space.
// Did this code successfully run on Leetcode : Couldn't find the problem
// Any problem you faced while coding this : No (Watched online explanations)
class BinarySearch {
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        //Write your code here
        while (l <= r)
        {
            int mid = l + (r - l)/2;

            // If the target element is present in the middle
            if (arr[mid] == x)
            {
                return mid;
            }

            // If element is smaller than mid, it can be possible on the left subarray
            if (arr[mid] > x)
            {
                r = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return -1;
    }
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
