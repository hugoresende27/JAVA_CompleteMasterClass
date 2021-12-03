/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */

class Sequencias {
    public boolean array123(int[] nums) {
        for (int i=0; i<nums.length -2; i++){
            if ((nums[i]==1) && (nums[i+1]==2) && (nums[i+2]==3)){
                //System.out.printf("%d %d %d",nums[i],nums[i+1],nums[i+2]);
                return true;
            }
        }
        return false;
    }
}
public class array123 {
    public static void main(String[] args) {
        Sequencias seq = new Sequencias();
        int arr1[]={1,1,2,3,1};
        int arr2[]={1,1,2,4,1};
        int arr3[]={1,1,2,1,2,3};
        int arr4[]={0,0,0};

        System.out.println(seq.array123(arr1));
        System.out.println(seq.array123(arr2));
        System.out.println(seq.array123(arr3));
        System.out.println(seq.array123(arr4));
    }
}
