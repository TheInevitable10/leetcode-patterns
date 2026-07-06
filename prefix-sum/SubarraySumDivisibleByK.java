import java.util.HashMap;
import java.util.Map;
public class SubarraySumDivisibleByK{

    public static int subarrayDivByK(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0,1);
        for(int i = 0 ; i < nums.length ; i++){
            sum+= nums[i];
            int rem = sum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem, 0) +1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        System.out.println(subarrayDivByK(nums,5));    
    }

}