/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the
value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
 */
public class has271 {
    public static boolean has271(int[] nums) {

        for (int i=0; i< nums.length-1; i++) {

            if ((nums[i+1] == nums[i]+5) && (Math.abs(nums[i+2] - (nums[i]-1)) <=2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[]={1,2,7,1};
        int arr2[]={1,2,8,1};
        int arr3[]={2,7,1};
        int arr4[]={2,7,4};
        System.out.println(has271(arr1));
        System.out.println(has271(arr2));
        System.out.println(has271(arr3));
        System.out.println(has271(arr4));
    }
}
