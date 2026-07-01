import java.util.Arrays;

public class RunningSumOf1DArray {

    public static int[] runningSum(int[] arr){
        for(int i = 1 ; i< arr.length ; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,4,3};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}