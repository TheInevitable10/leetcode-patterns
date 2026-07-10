public class ContWithMostWater{
    public static int maxArea(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        while(left<right){
            int distance = right - left;
            int curr = 0;
            if(nums[left] < nums[right]){
                curr = nums[left];
                left++;
            }
            else{
                curr = nums[right];
                right--;
            }
            if(ans < distance * curr){
                ans = distance * curr;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}