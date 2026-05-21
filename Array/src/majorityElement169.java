import java.util.*;
public class majorityElement169 {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
    public static void main(String[] args) {
        majorityElement169   me = new majorityElement169  ();
        int[] testnumbers = {0,5,0,4,0,0,3};
        int result= me.majorityElement(testnumbers);
        System.out.println(result);

    }
}

