public class LargestAltitude {

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < gain.length; i++){
            sum += gain[i];
            
            if(sum>max) max = sum;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(nums));
    }
}