/*
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
//nos ciclos for o length para arrays nao leva (), o () é usado em string objects. De notar tbm que length - 1 porque se o array tiver comprimento 5, terá as posiçoes [0],[1],[2],[3] e [4], logo irá de 0 até (5-1) = 4
 */
public class array667 {
    public static int array667(int[] nums) {
        int seis = 6, sete = 7;
        int contador=0;
        for (int i=0; i < nums.length-1; i++)
        {
            if (nums[i]==seis && (nums[i+1]==seis || nums[i+1]==sete)){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int arr[] = {6,6,2};
        int arr2[] = {6,6,2,6};
        int arr3[] = {6,7,2,6};
        System.out.println(array667(arr));
        System.out.println(array667(arr2));
        System.out.println(array667(arr3));
    }
}
