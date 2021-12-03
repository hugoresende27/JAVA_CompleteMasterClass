/*
Class names should be nouns in UpperCamelCase
Given an array of ints, return the number of 9's in the array.
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */
class Conta9{
    public int arrayCount9(int[] nums) {
        int noves=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==9){
                noves++;
            }
        }
        return noves;
    }

    public boolean arrayFront9(int[] nums) {
        if (nums.length>=4){
            for (int i=0; i<4; i++){
                if(nums[i]==9) return true;
            }
        } else {
            for (int i=0; i<nums.length; i++){
                if(nums[i]==9) return true;
            }
        }
       return false;
    }
}

public class arrayCount9 {
    public static void main(String[] args) {
        Conta9 x = new Conta9();
        int arr1[]={1,2,9};
        int arr2[]={1,9,9};
        int arr3[]={1,9,9,3,9};

        System.out.println(x.arrayCount9(arr1));
        System.out.println(x.arrayCount9(arr2));
        System.out.println(x.arrayCount9(arr3));

        int arr4[]={1,2,9,3,4};
        int arr5[]={1,2,3,4,9};
        int arr6[]={1,2,3,4,5};

        System.out.println(x.arrayFront9(arr4));
        System.out.println(x.arrayFront9(arr5));
        System.out.println(x.arrayFront9(arr6));
    }
}
