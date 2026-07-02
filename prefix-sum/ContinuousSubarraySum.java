import java.util.HashMap;

public class ContinuousSubarraySum{
    public static boolean checkSubarraySum(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int total = 0;
        for(int i = 0; i < nums.length ; i++){
            total+=nums[i];
            if(map.containsKey(total%k)){
                int index = map.get(total%k);
                if(i - index >= 2){
                    return true;
                }
            } else{
                map.put(total%k,i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] num = {23,2,6,4,7};
        System.out.println(checkSubarraySum(num, 6));
    }
}