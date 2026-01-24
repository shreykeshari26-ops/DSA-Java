package arrays;
//xor concept
public class LC136_singleNumber {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int x: nums){
            ans=ans^x;

        }
        return ans;
    }
}

