/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */

public class noTriples {
    public static boolean noTriples(int[] nums) {
        if (nums.length >=3) {
            for (int i=0; i < nums.length -1; i++){
                if ((nums[i] == nums[i+1]) && (nums[i+1] == nums[i+2])) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean noTriples2(int[] nums) {
        for (int i=0; i<(nums.length - 2); i++){
            int first = nums[i];
            if (nums[i+1] == first && nums[i+2]==first) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[]={1,1,2,2,1};
        int arr2[]={1,1,2,2,2,1};
        int arr3[]={1,1,1,2,2,2,1};
        int arr4[] = {1,1,1};
        int arr5[] = {1,1};
        System.out.println(noTriples(arr1));
        System.out.println(noTriples(arr2));
        System.out.println(noTriples(arr3));
        System.out.println(noTriples(arr4));
        System.out.println(noTriples(arr5));
        System.out.println("################################");

        System.out.println(noTriples2(arr1));
        System.out.println(noTriples2(arr2));
        System.out.println(noTriples2(arr3));
        System.out.println(noTriples2(arr4));
        System.out.println(noTriples2(arr5));
    }
}
