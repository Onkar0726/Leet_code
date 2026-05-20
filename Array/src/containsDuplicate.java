import java.util.*;
public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
        public static void main(String[] args) {
            containsDuplicate cd = new containsDuplicate();
            int[] testNumbers = {1,2,3,1};
            boolean result = cd.containsDuplicate(testNumbers);
            System.out.println("contains duplicate" + result);
        }
    }


