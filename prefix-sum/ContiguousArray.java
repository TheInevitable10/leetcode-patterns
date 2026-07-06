import java.util.HashMap;

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                sum += -1;
            }
            else{
                sum += 1;
            }
            if(map.containsKey(sum)){
                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
}
