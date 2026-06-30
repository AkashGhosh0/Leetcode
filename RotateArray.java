/*Rotate an Array
Rotate the array by k positions (both left and right rotation versions) */

public class RotateArray {

    public int[] rotateArray(int[] nums, int k) {
        int arr2[] = new int[nums.length];
        int j = 0;
        int copy_k = k;
        for (int i = k; i <= nums.length; i++) {
            arr2[j] = nums[k];
            j++;
        }   
        for (int l = 0; l < copy_k; l++) {
            arr2[j] = nums[l];
            j++;
        }
        return arr2;
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int[] result = ra.rotateArray(nums, k);
        System.out.println("Rotated array: " + java.util.Arrays.toString(result));
    }
}