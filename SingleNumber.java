class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for (int num : nums) {
            result ^= num;
        }
        
        return result;
    }
}
public class SingleNumber{
    public static void main(String[] args) {
        
    }
}
