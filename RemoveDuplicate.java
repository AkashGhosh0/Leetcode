/*Remove Duplicates from Sorted Array
Modify the array in place and return the length of the unique portion. */

public class RemoveDuplicate {

    public int removeDuplicate(int arr[]){
        if ( arr == null || arr.length == 0) {
            return 0;
        }

        int size = arr.length;
        for (int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if (arr[i] == arr[j]) {
                    for(int k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    size--;
                    j--;
                }
            }   
        }
        return size;
    }
    public static void main(String[] args) {
        RemoveDuplicate r = new RemoveDuplicate();
        int[] arr = {1, 1, 2, 2, 3, 4, 5 , 6};
        int result = r.removeDuplicate(arr);
        System.out.println("Length of unique portion: " + result);
    }
}