package datastructure;

/**
 * @author zhaomo
 */
public class RecursionSum {
    public static int sum(int[] arr){
        return sum(arr,0);
    }

    private static int sum(int[] arr, int l) {
        if (l ==arr.length){
            return 0;
        }
        return arr[l] +sum(arr,l+1);
    }

    public static void main(String[] args) {
        int[] nums ={ 1,2,3,4,5,6,7,8,9};
        System.out.println("sum(nums) = " + sum(nums));

    }

}
