/*Binary Search
Implement binary search in a sorted array. */

public class BinarySearch {
    public int binarySearch(int arr[], int tergat){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (tergat == arr[mid]) {
                return mid; 
            }
            else if (tergat > arr[mid]) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;        
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tergat = 3;

        int result = obj.binarySearch(arr, tergat);
        System.out.print("the result is:- " + result);
    }
}
