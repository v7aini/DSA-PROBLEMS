//import java.util.*;
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {

            // Circular comparison 
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}
/*optional code
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("array elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        boolean result = obj.check(nums);
        System.out.println(result);
    }
}*/
