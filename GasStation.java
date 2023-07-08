class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int currentGas = 0;
        int start = 0;
        
        for (int i = 0; i < n; i++) {
            totalGas += gas[i] - cost[i];
            currentGas += gas[i] - cost[i];
            
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }
        
        if (totalGas >= 0) {
            return start;
        } else {
            return -1;
        }
    }
}
 public class GasStation{
    public static void main(String[] args) {
        
    }
 }
